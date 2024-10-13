package io.rescrypt.parking_lot.model;

import java.time.LocalDateTime;

public class Ticket extends BaseModel {
    private LocalDateTime createdAt;
    private Operator createdBy;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Gate gate;
}
