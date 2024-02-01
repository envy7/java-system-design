package com.dogdaycare.model;

public class Husky extends Dog {
    public Husky(Integer id, String name, DogSize size, boolean isVaccinated) {
        super(id, name, size, isVaccinated);
    }

    public void bark() {
        System.out.println("Woof Woof");
    }
}
