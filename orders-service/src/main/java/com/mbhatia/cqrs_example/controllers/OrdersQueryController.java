package com.mbhatia.cqrs_example.controllers;

import com.mbhatia.cqrs_example.models.NewOrder;
//import com.mbhatia.cqrs_example.models.OrderQuery;
import com.mbhatia.cqrs_example.services.implementations.OrderQueryService;
import java.math.BigInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@RestController
@RequestMapping("/api/orders")
public class OrdersQueryController {
    private OrderQueryService IOrderQueryService;

    public OrdersQueryController(OrderQueryService orderQueryService){
        this.IOrderQueryService = orderQueryService;
    }

    @GetMapping("")
    public Flux<NewOrder> getOrders(){
        return IOrderQueryService.getOrders();
    }

    @GetMapping("/{orderId}")
    public Mono<NewOrder> getOrderById(@PathVariable BigInteger orderId){
        return IOrderQueryService.getOrderById(orderId);
    }

}
