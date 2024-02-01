package com.dogdaycare.model;

import java.util.*;

public class Playground {
    private final Integer id;
    private final Integer capacity;
    private HashSet<DogSize> allowedDogSizes;
    private final Map<Integer, Dog> dogs = new HashMap<>();

    public Playground(Integer id, Integer capacity, HashSet<DogSize> allowedSizes) {
        this.id = id;
        this.capacity = capacity;
        this.allowedDogSizes = allowedSizes;
    }

    public void allowDogSize(DogSize size) {
        allowedDogSizes.add(size);
    }

    public boolean isDogAllowed(Dog dog) {
        return allowedDogSizes.contains(dog.getSize());
    }

    public boolean isFull() {
        return dogs.size() >= this.capacity;
    }

    private boolean passPrerequisites(Dog dog) {
        return dog.isVaccinated();
    }

    public void registerDog(Dog dog) {
        if (isFull() || !passPrerequisites(dog)) {
            System.out.println(dog.getName() + " cannot be registered");
            return;
        }

        dogs.put(dog.getId(), dog);
        System.out.println(dog.getName() + " has been registered in the playground " + this.id.toString());
    }

    public void unregisterDog(Dog dog) {
        dogs.remove(dog.getId());
        System.out.println(dog.getName() + " has been unregistered from the playground " + this.id.toString());
    }

    public void displayDogs() {
        dogs.forEach((key, value) -> {
            System.out.println("Id: " + key + " Name: " + value.getName());
            value.bark();
        });
    }
}
