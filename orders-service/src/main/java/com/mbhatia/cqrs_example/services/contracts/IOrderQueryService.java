package com.mbhatia.cqrs_example.services.contracts;

import com.mbhatia.cqrs_example.models.NewOrder;
//import com.mbhatia.cqrs_example.models.OrderQuery;
import java.math.BigInteger;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IOrderQueryService {
    Flux<NewOrder> getOrders();
    Mono<NewOrder> getOrderById(BigInteger orderId);
}
