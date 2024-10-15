package io.rescrypt.parking_lot.service;

import io.rescrypt.parking_lot.model.Gate;
import io.rescrypt.parking_lot.repository.GateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GateService {

    private final GateRepository gateRepository;

    @Autowired
    public GateService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Gate getGate(Long gateId) {
        return this.gateRepository.getGate(gateId);
    }
}
