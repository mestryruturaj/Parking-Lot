package io.rescrypt.parking_lot.model;

import lombok.Data;

@Data
public class ElectricParkingSpot extends ParkingSpot {
    private ElectricMeter electricMeter;
}
