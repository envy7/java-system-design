package com.parking.model.spots;

import com.parking.model.vehicles.Vehicle;
import com.parking.model.VehicleSize;

public class LargeParkingSpot extends ParkingSpot {
    private static final int largeParkingRatePerHour = 10;

    public LargeParkingSpot(int spotId) {
        super(spotId, "Large");
    }
    @Override
    public boolean canAssignVehicle(Vehicle vehicle) {
        System.out.println("Testing vehicle: " + vehicle.getRegistrationId() + " " + vehicle.getSize());
        System.out.println(vehicle.getSize().compareTo(VehicleSize.LARGE) <= 0);
        return vehicle.getSize().compareTo(VehicleSize.LARGE) <= 0;
    }

    @Override
    public int getParkingRatePerHour() {
        return largeParkingRatePerHour;
    }
}
