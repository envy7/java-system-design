package com.dogdaycare.service;

import com.dogdaycare.model.Dog;
import com.dogdaycare.model.Playground;

import java.util.ArrayList;
import java.util.List;

public class PlaygroundManager {
    private final List<Playground> playgroundList = new ArrayList<>();

    public void addPlayground(Playground playground) {
        playgroundList.add(playground);
    }

    public Playground getPlayground(Dog dog) {
        for (Playground playground : playgroundList) {
            if (!playground.isFull() && playground.isDogAllowed(dog)) {
                return playground;
            }
        }
        return null;
    }
}
