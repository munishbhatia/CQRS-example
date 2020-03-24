package com.mbhatia.cqrs_example.services.implementations;

import com.mbhatia.cqrs_example.dtos.NewOrderDTO;
import com.mbhatia.cqrs_example.models.NewOrder;
import com.mbhatia.cqrs_example.repositories.contracts.OrderCommandRepository;
import com.mbhatia.cqrs_example.services.contracts.IOrderCommandService;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.math.BigInteger;

@Service
public class OrderCommandService implements IOrderCommandService {
    private OrderCommandRepository orderCommandRepository;

    @Autowired
    public OrderCommandService(OrderCommandRepository orderCommandRepository){
        this.orderCommandRepository = orderCommandRepository;
    }

    @Override
    public NewOrder createOrder(NewOrderDTO newOrderDTO) {
        NewOrder newOrder = new NewOrder();
        newOrder.setProducts(Arrays.asList("T-connector", "pipes"));
        return orderCommandRepository.save(newOrder);
    }

    @Override
    public void deleteOrder(BigInteger orderId) {
        if(orderCommandRepository.existsById(orderId))
            orderCommandRepository.deleteById(orderId);
    }
}
