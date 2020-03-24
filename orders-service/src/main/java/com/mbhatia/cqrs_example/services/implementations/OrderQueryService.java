package com.mbhatia.cqrs_example.services.implementations;

import com.mbhatia.cqrs_example.models.NewOrder;
//import com.mbhatia.cqrs_example.models.OrderQuery;
import com.mbhatia.cqrs_example.repositories.contracts.OrderQueryRepository;
import com.mbhatia.cqrs_example.services.contracts.IOrderQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Repository
public class OrderQueryService implements IOrderQueryService {
    private OrderQueryRepository orderQueryRepository;

    @Autowired
    public OrderQueryService(OrderQueryRepository orderQueryRepository){
        this.orderQueryRepository = orderQueryRepository;
    }

    @Override
    public Flux<NewOrder> getOrders() {
        return orderQueryRepository.findAll();
    }

    @Override
    public Mono<NewOrder> getOrderById(BigInteger orderId) {
        return orderQueryRepository.findById(orderId);
    }
}
