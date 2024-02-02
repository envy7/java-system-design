package com.dogdaycare.model;

public class Pug extends Dog {

    public Pug(String name, DogSize size, boolean isVaccinated) {
        super(name, size, isVaccinated);
    }

    public void bark() {
        System.out.println("woof woof");
    }
}
