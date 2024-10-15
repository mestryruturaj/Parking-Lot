package io.rescrypt.parking_lot.repository;

import io.rescrypt.parking_lot.model.Operator;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OperatorRepository {
    private final Map<Long, Operator> idToOperator;
    private static long id;

    public OperatorRepository() {
        this.idToOperator = new HashMap<>();
        this.idToOperator.put(1L, new Operator("Jane", "Doe"));
        this.idToOperator.put(2L, new Operator("John", "Doe"));
        OperatorRepository.id = 2L;
    }

    public Operator getOperator(Long id) {
        return this.idToOperator.get(id);
    }

    public Operator saveOperator(Operator operator) {
        OperatorRepository.id++;
        operator.setId(OperatorRepository.id);
        this.idToOperator.put(OperatorRepository.id, operator);
        return operator;
    }
}
