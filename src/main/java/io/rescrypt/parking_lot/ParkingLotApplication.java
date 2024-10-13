package io.rescrypt.parking_lot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingLotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingLotApplication.class, args);
	}

}

/**
 * Flow
 * [1] Driver find the Parking Lot
 * [2] Finds the entry gate
 * [3] Finds the operator at the entry gate
 * [4] Gets a ticket for himself(Vehicle)
 * [5] Goes to the parking floor
 * [6] Finds the assigned spot and parks the vehicle.
 * [7] Finds the exit gate
 * [8] Pays the bill for parking duration and charging if applicable
 */

/*
* Requirements
* [1] One parking lot
* [2] Multiple parking floors
* [3] N number of parking spots
* [4] Types of parking spots
* [5] Entry and Exit gates
* [6] Operator
* [7] Ticket
* [8] Bill
* [9] Payment types
* */
