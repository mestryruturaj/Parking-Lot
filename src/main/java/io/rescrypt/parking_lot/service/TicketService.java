package io.rescrypt.parking_lot.service;

import io.rescrypt.parking_lot.dto.GenerateTicketRequest;
import io.rescrypt.parking_lot.dto.GenerateTicketResponse;
import io.rescrypt.parking_lot.model.Gate;
import io.rescrypt.parking_lot.model.Operator;
import io.rescrypt.parking_lot.model.Ticket;
import io.rescrypt.parking_lot.model.Vehicle;
import io.rescrypt.parking_lot.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    private final GateService gateService;
    private final VehicleService vehicleService;
    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(GateService gateService, VehicleService vehicleService, TicketRepository ticketRepository) {
        this.gateService = gateService;
        this.vehicleService = vehicleService;
        this.ticketRepository = ticketRepository;
    }

    public GenerateTicketResponse generateTicket(GenerateTicketRequest generateTicketRequest) {
        //Fetch Gate
        Gate gate = gateService.getGate(generateTicketRequest.getGateId());

        //Fetch Operator
        Operator operator = gate.getOperator();

        //Fetch Vehicle or create
        Vehicle vehicle = vehicleService.getVehicle(generateTicketRequest.getVehicleId());
        if (vehicle == null) {
            vehicle = vehicleService.registerVehicleDetails(generateTicketRequest.getVehicleType(), generateTicketRequest.getNumberPlate());
        }

        //Create Ticket
        Ticket ticket = new Ticket();
        ticket.setGate(gate);
        ticket.setOperator(operator);
        ticket.setVehicle(vehicle);

        //Save Ticket
        Ticket savedTicket = ticketRepository.saveTicket(ticket);

        //Return saved Ticket
        GenerateTicketResponse generateTicketResponse = new GenerateTicketResponse();
        generateTicketResponse.setTicket(savedTicket);
        return generateTicketResponse;
    }
}
