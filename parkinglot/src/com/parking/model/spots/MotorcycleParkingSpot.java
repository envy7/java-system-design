package com.parking.model.spots;

import com.parking.model.vehicles.Vehicle;
import com.parking.model.VehicleSize;

public class MotorcycleParkingSpot extends ParkingSpot {

    public MotorcycleParkingSpot(int spotId) {
        super(spotId, "Motorcycle");
    }
    @Override
    public boolean canAssignVehicle(Vehicle vehicle) {
        return vehicle.getSize().compareTo(VehicleSize.MOTORCYCLE) == 0;
    }
}
