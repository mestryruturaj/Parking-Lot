package io.rescrypt.parking_lot.dto;

import io.rescrypt.parking_lot.enums.VehicleType;
import lombok.Data;

@Data
public class GenerateTicketRequest {
    private Long gateId;
    private Long vehicleId;
    private VehicleType vehicleType;
    private String numberPlate;
}