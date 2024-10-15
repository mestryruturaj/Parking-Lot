package io.rescrypt.parking_lot.repository;

import io.rescrypt.parking_lot.enums.GateType;
import io.rescrypt.parking_lot.model.Gate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class GateRepository {
    private final Map<Long, Gate> idToGate;
    private final OperatorRepository operatorRepository;
    private static long id;

    public GateRepository(OperatorRepository operatorRepository) {
        this.operatorRepository = operatorRepository;
        this.idToGate = new HashMap<>();
        this.idToGate.put(1L, new Gate(this.operatorRepository.getOperator(1L), GateType.ENTRY));
        this.idToGate.put(2L, new Gate(this.operatorRepository.getOperator(2L), GateType.EXIT));
        GateRepository.id = 2L;
    }

    public Gate getGate(Long id) {
        return this.idToGate.get(id);
    }

    public Gate saveGate(Gate gate) {
        GateRepository.id++;
        gate.setId(GateRepository.id);
        this.idToGate.put(id, gate);
        return this.idToGate.get(id);
    }
}
