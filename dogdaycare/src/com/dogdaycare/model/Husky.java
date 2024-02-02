package com.dogdaycare.model;

public class Husky extends Dog {
    public Husky(String name, DogSize size, boolean isVaccinated) {
        super(name, size, isVaccinated);
    }

    public void bark() {
        System.out.println("Woof Woof");
    }
}
