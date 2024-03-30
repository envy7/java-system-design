package com.parking.model.vehicles;

import com.parking.model.VehicleSize;

public class Car extends Vehicle {

    public Car(String registrationId) {
        super(registrationId, VehicleSize.COMPACT);
    }
}
