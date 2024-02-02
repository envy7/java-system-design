package com.dogdaycare.model;

public abstract class Dog {
    private final String name;
    private Integer registrationId;
    private Integer playgroundId;
    private final DogSize size;
    private final boolean isVaccinated;

    public Dog(String name, DogSize size, boolean isVaccinated) {
        this.name = name;
        this.size = size;
        this.isVaccinated = isVaccinated;
    }

    public abstract void bark();

    public String getName() {
        return name;
    }

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public Integer getPlaygroundId() {
        return playgroundId;
    }

    public void setPlaygroundId(Integer playgroundId) {
        this.playgroundId = playgroundId;
    }

    public DogSize getSize() {
        return size;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }
}
