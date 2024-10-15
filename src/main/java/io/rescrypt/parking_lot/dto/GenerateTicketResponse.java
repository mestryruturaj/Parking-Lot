package io.rescrypt.parking_lot.dto;

import io.rescrypt.parking_lot.model.Ticket;
import lombok.Data;

@Data
public class GenerateTicketResponse {
    private Ticket ticket;
}
