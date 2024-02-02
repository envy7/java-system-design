package com.dogdaycare.service;

import com.dogdaycare.model.Dog;
import com.dogdaycare.model.Playground;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public Playground getPlayground(Dog dog, Integer playgroundId) {
        for (Playground playground : playgroundList) {
            if (Objects.equals(playground.getPlaygroundId(), playgroundId)) {
                return playground;
            }
        }
        System.out.println("NOt able to find playground for " + dog.getName());
        return null;
    }
}
