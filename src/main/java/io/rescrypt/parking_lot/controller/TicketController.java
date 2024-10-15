package io.rescrypt.parking_lot.controller;


import io.rescrypt.parking_lot.dto.GenerateTicketRequest;
import io.rescrypt.parking_lot.dto.GenerateTicketResponse;
import io.rescrypt.parking_lot.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {
    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public GenerateTicketResponse generateTicket(@RequestBody GenerateTicketRequest generateTicketRequest) {
        GenerateTicketResponse generateTicketResponse = this.ticketService.generateTicket(generateTicketRequest);
        return generateTicketResponse;
    }
}
