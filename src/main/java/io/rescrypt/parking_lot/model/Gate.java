package io.rescrypt.parking_lot.model;

import io.rescrypt.parking_lot.enums.GateType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gate extends BaseModel {
    private Operator operator;
    private GateType gateType;
}
