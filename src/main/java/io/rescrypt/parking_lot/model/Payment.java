package io.rescrypt.parking_lot.model;

import io.rescrypt.parking_lot.enums.PaymentMode;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Payment extends BaseModel {
    private PaymentMode paymentMode;
    private Double amount;
    private LocalDateTime createdAt;
    private String referenceId;
}
