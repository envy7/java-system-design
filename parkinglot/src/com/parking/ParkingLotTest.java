package com.parking;

import com.parking.model.Entrance;
import com.parking.model.Exit;
import com.parking.model.ParkingTicket;
import com.parking.model.vehicles.Car;
import com.parking.model.vehicles.Motorcycle;
import com.parking.model.vehicles.Truck;
import com.parking.model.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotTest {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        Entrance entrance = parkingLot.getEntranceById(0);
        Exit exit = parkingLot.getExitById(0);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car("CAR"));
        vehicleList.add(new Motorcycle("MOTOR"));
        vehicleList.add(new Truck("TRUCK"));
        vehicleList.add(new Car("NEWCAR"));

        Vehicle handicappedAccessCar = new Car("HANDICAPPED");
        handicappedAccessCar.setHandicappedPermit();
        vehicleList.add(handicappedAccessCar);

        for (Vehicle vehicle : vehicleList) {
            System.out.println("Testing entry for vehicle: " + vehicle.getSize());
            ParkingTicket parkingTicket = entrance.assignTicket(vehicle);
            if (parkingTicket == null) {
                return;
            }
        }

    }
}
