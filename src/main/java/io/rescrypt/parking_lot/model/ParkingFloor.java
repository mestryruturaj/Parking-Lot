package io.rescrypt.parking_lot.model;

import lombok.Data;

import java.util.List;

@Data
public class ParkingFloor extends BaseModel {
    private List<ParkingSpot> parkingSpots;
    private Integer floorNumber;
}
