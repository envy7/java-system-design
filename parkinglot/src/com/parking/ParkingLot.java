package com.parking;

import com.parking.model.Entrance;
import com.parking.model.Exit;
import com.parking.model.spots.*;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    // Can be a separate Address model
    private String address;
    private String name;
    private List<Entrance> entrances = new ArrayList<>();
    private List<Exit> exits = new ArrayList<>();

    private static ParkingLot parkingLot = null;

    // Singleton class
    private ParkingLot() {
        // Bootstrap some initial working parking lot with entrances and exits
        Entrance entrance = new Entrance(0);
        Exit exit = new Exit(0);
        addEntrance(entrance);
        addExit(exit);

        for (int i = 0; i < 1; i ++) {
            SpotManager.addSpot(new HandicappedParkingSpot(i));
            SpotManager.addSpot(new CompactParkingSpot(i));
            SpotManager.addSpot(new LargeParkingSpot(i));
            SpotManager.addSpot(new MotorcycleParkingSpot(i));
        }
    }

    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public void addEntrance(Entrance entrance) {
        entrances.add(entrance);
    }

    public void addExit(Exit exit) {
        exits.add(exit);
    }

    public Entrance getEntranceById(int id) {
        try {
            return entrances.get(id);
        } catch(Exception e) {
            System.out.println("Entrance of this id doesn't exist, returning an existing entrance");
            return entrances.get(0);
        }

    }

    public Exit getExitById(int id) {
        try {
            return exits.get(id);
        } catch(Exception e) {
            System.out.println("Entrance of this id doesn't exist, returning an existing exit");
            return exits.get(0);
        }
    }

}
