package com.mbhatia.cqrs_example.controllers;

import com.mbhatia.cqrs_example.dtos.NewOrderDTO;
import com.mbhatia.cqrs_example.models.NewOrder;
import com.mbhatia.cqrs_example.services.contracts.IOrderCommandService;
import com.mbhatia.cqrs_example.services.implementations.OrderCommandService;
//import java.math.BigInteger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/api/orders")
public class OrdersCommandController {
    private OrderCommandService orderCommandService;

    public OrdersCommandController(OrderCommandService orderCommandService){
        this.orderCommandService = orderCommandService;
    }

    @PostMapping("")
    public NewOrder createOrder(@RequestBody NewOrderDTO newOrderDTO){
        return orderCommandService.createOrder(newOrderDTO);
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable BigInteger orderId){
        orderCommandService.deleteOrder(orderId);
    }
}
