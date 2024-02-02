package com.dogdaycare.model;

import java.util.*;

public class Playground {
    private final Integer playgroundId;
    private final Integer capacity;
    private final HashSet<DogSize> allowedDogSizes;
    private final Map<Integer, Dog> dogs = new HashMap<>();

    public Playground(Integer playgroundId, Integer capacity, HashSet<DogSize> allowedSizes) {
        this.playgroundId = playgroundId;
        this.capacity = capacity;
        this.allowedDogSizes = allowedSizes;
    }

    public Integer getPlaygroundId() {
        return playgroundId;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void allowDogSize(DogSize size) {
        allowedDogSizes.add(size);
    }

    public boolean isDogAllowed(Dog dog) {
        return allowedDogSizes.contains(dog.getSize());
    }

    public boolean isFull() {
        return getSize() >= this.capacity;
    }

    public Integer getSize() {
        return dogs.size();
    }

    private boolean passPrerequisites(Dog dog) {
        return dog.isVaccinated();
    }

    public void registerDog(Dog dog) {
        if (isFull() || !passPrerequisites(dog)) {
            System.out.println(dog.getName() + " cannot be registered");
            return;
        }

        Integer dogId = getSize() + 1;
        dog.setRegistrationId(dogId);
        dog.setPlaygroundId(playgroundId);
        dogs.put(dog.getRegistrationId(), dog);
        System.out.println(dog.getName() + " has been registered in the playground " + playgroundId.toString());
    }

    public void unregisterDog(Dog dog) {
        dogs.remove(dog.getRegistrationId());
        System.out.println(dog.getName() + " has been unregistered from the playground " + playgroundId.toString());
    }

    public void displayDogs() {
        dogs.forEach((key, value) -> {
            System.out.println("====================");
            System.out.println("Id: " + key);
            System.out.println("PlaygroundId: " + value.getPlaygroundId());
            System.out.println("Name: " + value.getName());
            value.bark();
        });
    }
}
