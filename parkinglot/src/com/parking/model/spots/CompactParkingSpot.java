package com.parking.model.spots;

import com.parking.model.vehicles.Vehicle;
import com.parking.model.VehicleSize;

public class CompactParkingSpot extends ParkingSpot {

    public CompactParkingSpot(int spotId) {
        super(spotId, "Compact");
    }
    @Override
    public boolean canAssignVehicle(Vehicle vehicle) {
        return vehicle.getSize().compareTo(VehicleSize.COMPACT) <= 0;
    }
}
