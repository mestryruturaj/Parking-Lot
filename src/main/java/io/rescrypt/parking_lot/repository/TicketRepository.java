package io.rescrypt.parking_lot.repository;

import io.rescrypt.parking_lot.model.Ticket;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TicketRepository {
    private final Map<Long, Ticket> idToTicket;
    private static long id = 0;

    public TicketRepository() {
        this.idToTicket = new HashMap<>();
    }

    public Ticket getTicket(Long id) {
        return this.idToTicket.get(id);
    }

    public Ticket saveTicket(Ticket ticket) {
        TicketRepository.id++;
        ticket.setId(TicketRepository.id);
        this.idToTicket.put(id, ticket);
        return ticket;
    }
}
