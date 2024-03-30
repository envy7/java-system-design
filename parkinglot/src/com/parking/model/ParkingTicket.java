package com.parking.model;

import com.parking.model.spots.ParkingSpot;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingTicket {
    private final int id;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private boolean isPaid;
    private ParkingSpot parkingSpot;

    public ParkingTicket(int id) {
        this.id = id;
        this.entryTime = LocalDateTime.now();
        this.isPaid = false;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public int getTotalCost() {
        return (int) (parkingSpot.getParkingRatePerHour() * Duration.between(entryTime, exitTime).toMillis());
    }
}
