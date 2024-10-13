package io.rescrypt.parking_lot.model;

import io.rescrypt.parking_lot.enums.ParkingSpotType;
import io.rescrypt.parking_lot.enums.Status;
import lombok.Data;

@Data
public class ParkingSpot extends BaseModel {
    private Status parkingSpotStatus;
    private Ticket assignedTicket;
    private ParkingSpotType parkingSpotType;
}
