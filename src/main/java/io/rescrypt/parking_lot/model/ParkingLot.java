package io.rescrypt.parking_lot.model;

import lombok.Data;

import java.util.List;

@Data
public class ParkingLot extends BaseModel {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
}
