package com.parking.model.vehicles;

import com.parking.model.ParkingTicket;
import com.parking.model.VehicleSize;

public abstract class Vehicle {
    private final String registrationId;
    private final VehicleSize size;
    private ParkingTicket parkingTicket;
    private boolean handicappedPermit = false;

    public Vehicle(String registrationId, VehicleSize size) {
        this.registrationId = registrationId;
        this.size = size;
    }

    public VehicleSize getSize() {
        return size;
    }

    public String getRegistrationId() { return registrationId; }

    public boolean getHandicappedPermit() {
        return handicappedPermit;
    }

    public void setHandicappedPermit() {
        handicappedPermit = true;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }
}
