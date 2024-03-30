package com.parking.model.spots;

import com.parking.model.vehicles.Vehicle;

public abstract class ParkingSpot {

    private final int spotId;
    private final String parkingSpotType;
    private Vehicle vehicle = null;
    boolean isEmpty = true;
    private static final int parkingRatePerHour = 10;

    public ParkingSpot(int spotId, String parkingSpotType) {
        this.spotId = spotId;
        this.parkingSpotType = parkingSpotType;
    }

    // Delegate logic to subclass
    public abstract boolean canAssignVehicle(Vehicle vehicle);

    public boolean assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty = false;
        return true;
    }
    public boolean removeVehicle(Vehicle vehicle) {
        this.vehicle = null;
        isEmpty = true;
        return true;
    }

    public int getSpotId() {
        return spotId;
    }

    public String getParkingSpotType() {
        return parkingSpotType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setOccupied() {
        isEmpty = false;
    }

    public int getParkingRatePerHour() {
        return parkingRatePerHour;
    }


}
