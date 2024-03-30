package com.parking.model.vehicles;

import com.parking.model.VehicleSize;

public class Motorcycle extends Vehicle {
    public Motorcycle(String registrationId) {
        super(registrationId, VehicleSize.MOTORCYCLE);
    }
}
