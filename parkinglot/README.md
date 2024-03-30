# Parking Lot
Generic low level system design question

## Overview of Requirements
1. Design a parking lot. Can have entry, exits, tickets, parking lots, different cars etc
2. The design should be maintainable to add new constraints

### Detailed Requirements
1. Parking lot has a fixed capacity of N vehicles
2. There are 4 different types of parking spots: handicapped, compact, large, motorcycle - Done
3. Parking lot has multiple entrances and exits - Done
4. There are 4 types of vehicles Car, Truck, Van, Motorcycle - Done
5. No vehicles allowed once capacity is reached
6. Customers should be able to collect parking ticket from entrance and pay at the exit - Done
7. Payment is calculated at an hourly rate - Done

### Optional Requirements
1. Display board that shows free parking spots for each parking spot type
2. Customers can pay for the ticket either with an automated entry panel or pay the parking agent
3. Multiple payment modes cash / credit / debit card

### Design Questions
1. Have abstract classes for parking spot and cars
2. Need a data structure to store all available parking spots of the different types
3. Need to match the spot types to the cars