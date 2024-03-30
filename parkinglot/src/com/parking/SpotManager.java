package com.parking;

import com.parking.model.spots.*;
import com.parking.model.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class SpotManager {

    private static final List<ParkingSpot> parkingSpotList = new ArrayList<>();

    public static ParkingSpot assignSpot(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpotList) {
            if (spot.canAssignVehicle(vehicle) && spot.isEmpty()) {
                spot.assignVehicle(vehicle);
                spot.setOccupied();
                return spot;
            }
        }

        return null;
    }

    public static void addSpot(ParkingSpot spot) {
        parkingSpotList.add(spot);
    }
}
