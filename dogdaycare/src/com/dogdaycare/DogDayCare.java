package com.dogdaycare;

import com.dogdaycare.model.*;
import com.dogdaycare.service.PlaygroundManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DogDayCare {

    PlaygroundManager playgroundManager = new PlaygroundManager();

    public void addPlayground(Playground playground) {
        playgroundManager.addPlayground(playground);
    }

    public void registerDog(Dog dog) {
        Playground playground = playgroundManager.getPlayground(dog);
        playground.registerDog(dog);
    }

    public void unRegisterDog(Dog dog) {
        if ( dog.getPlaygroundId() == null ) {
            System.out.println(dog.getName() + " isn't a registered dog");
            return;
        }
        Playground playground = playgroundManager.getPlayground(dog, dog.getPlaygroundId());
        playground.unregisterDog(dog);
    }

    public static void main(String[] args) {
        DogDayCare dogDayCare = new DogDayCare();

        Playground smallPlayground = new Playground(1, 5, new HashSet<>(Set.of(DogSize.SMALL)));
        Playground bigPlayground = new Playground(2, 10, new HashSet<>(Set.of(DogSize.LARGE)));

        dogDayCare.addPlayground(smallPlayground);
        dogDayCare.addPlayground(bigPlayground);

        Dog smallDog1 = new Pug("Buddy", DogSize.SMALL, true);
        Dog smallDog2 = new Pug("Daisy", DogSize.SMALL, true);
        Dog smallDog3 = new Husky("Charlie", DogSize.SMALL, true);
        Dog bigDog1 = new Pug("Max", DogSize.LARGE, false); // Not vaccinated
        Dog bigDog2 = new Husky("Bella", DogSize.LARGE, true);
        Dog bigDog3 = new Husky("Rocky", DogSize.LARGE, true);

        List<Dog> dogs = new ArrayList<>(List.of(smallDog1, smallDog2, smallDog3, bigDog1, bigDog2, bigDog3));

        for (Dog dog : dogs) {
            dogDayCare.registerDog(dog);
        }

        smallPlayground.displayDogs();
        bigPlayground.displayDogs();

        for (Dog dog : dogs) {
            dogDayCare.unRegisterDog(dog);
        }
    }
}
