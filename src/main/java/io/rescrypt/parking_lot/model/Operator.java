package io.rescrypt.parking_lot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operator extends BaseModel {
    private String firstName;
    private String lastName;
}
