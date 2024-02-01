package com.dogdaycare.model;

public class Pug extends Dog {

    public Pug(Integer id, String name, DogSize size, boolean isVaccinated) {
        super(id, name, size, isVaccinated);
    }

    public void bark() {
        System.out.println("woof woof");
    }
}
