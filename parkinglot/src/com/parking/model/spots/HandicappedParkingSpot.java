package com.parking.model.spots;

import com.parking.model.vehicles.Vehicle;
import com.parking.model.VehicleSize;

public class HandicappedParkingSpot extends ParkingSpot {

    public HandicappedParkingSpot(int spotId) {
        super(spotId, "Handicapped");
    }
    @Override
    public boolean canAssignVehicle(Vehicle vehicle) {
        return vehicle.getHandicappedPermit() && vehicle.getSize().compareTo(VehicleSize.LARGE) <= 0;
    }
}
