package com.parking.model;

import com.parking.SpotManager;
import com.parking.TicketManager;
import com.parking.model.spots.ParkingSpot;
import com.parking.model.vehicles.Vehicle;

public class Entrance {
    private final int id;

    public Entrance(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Assign spot and ticket
    public ParkingTicket assignTicket(Vehicle vehicle) {
        ParkingSpot parkingSpot = SpotManager.assignSpot(vehicle);
        if (parkingSpot == null) {
            System.out.println("No parking space for this vehicle");
            return null;
        }

        ParkingTicket ticket = TicketManager.getTicket();
        ticket.setParkingSpot(parkingSpot);
        vehicle.setParkingTicket(ticket);
        System.out.println("Vehicle successfully entered");
        return ticket;
    }

}
