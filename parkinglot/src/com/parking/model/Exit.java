package com.parking.model;

import java.time.LocalDateTime;

public class Exit {
    private final int id;
    public Exit(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Should have logic of validating and getting payment if the ticket is not already paid
    public boolean validateParkingTicket(ParkingTicket parkingTicket) {
        parkingTicket.setExitTime(LocalDateTime.now());
        int totalCost = parkingTicket.getTotalCost();
        System.out.println("Need to pay: " + totalCost);
        System.out.println("Vehicle successfully exited");
        return true;
    }
}
