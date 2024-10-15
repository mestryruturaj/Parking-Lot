package io.rescrypt.parking_lot.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Ticket extends BaseModel {
    private LocalDateTime createdAt;
    private Operator operator;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Gate gate;
}
