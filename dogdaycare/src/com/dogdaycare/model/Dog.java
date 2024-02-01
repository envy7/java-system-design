package com.dogdaycare.model;

public abstract class Dog {
    private final String name;
    private final Integer id;
    private final DogSize size;
    private final boolean isVaccinated;

    public Dog(Integer id, String name, DogSize size, boolean isVaccinated) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.isVaccinated = isVaccinated;
    }

    public abstract void bark();

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public DogSize getSize() {
        return size;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }
}
