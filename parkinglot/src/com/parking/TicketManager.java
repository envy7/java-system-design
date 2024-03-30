package com.parking;

import com.parking.model.ParkingTicket;

import java.util.HashMap;

public class TicketManager {
    private static HashMap<Integer, ParkingTicket> issuedTickets = new HashMap<Integer, ParkingTicket>();
    private static int nextTicketId = 0;
    private static final int MAX_TICKETS = 99999;

    public static ParkingTicket getTicket() {
        ParkingTicket parkingTicket = new ParkingTicket(nextTicketId);
        issuedTickets.put(parkingTicket.getId(), parkingTicket);
        nextTicketId = (nextTicketId % MAX_TICKETS) + 1;
        return parkingTicket;
    }

    public static boolean removeTicket(int ticketId) {
        return issuedTickets.remove(ticketId) != null;
    }

    public static ParkingTicket getTicketById(int ticketId) {
        return issuedTickets.get(ticketId);
    }
}
