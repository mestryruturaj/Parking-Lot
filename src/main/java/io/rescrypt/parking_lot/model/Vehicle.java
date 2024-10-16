package io.rescrypt.parking_lot.model;

import io.rescrypt.parking_lot.enums.VehicleType;
import lombok.Data;

@Data
public class Vehicle extends BaseModel {
    private VehicleType vehicleType;
    private String numberPlate;
}
