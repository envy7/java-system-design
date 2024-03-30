package com.parking.model.vehicles;

import com.parking.model.VehicleSize;
import com.parking.model.vehicles.Vehicle;

public class Truck extends Vehicle {
    public Truck(String registrationId) {
        super(registrationId, VehicleSize.LARGE);
    }
}
