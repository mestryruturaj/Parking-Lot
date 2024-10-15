package io.rescrypt.parking_lot.model;

import io.rescrypt.parking_lot.enums.BillStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Bill extends BaseModel {
    private Gate exitGate;
    private LocalDateTime createdAt;
    private Ticket ticket;
    private Double amount;
    private BillStatus billStatus;
    private List<Payment> paymentMethods;
}
