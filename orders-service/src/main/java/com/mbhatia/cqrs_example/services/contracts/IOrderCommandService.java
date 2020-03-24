package com.mbhatia.cqrs_example.services.contracts;

import com.mbhatia.cqrs_example.dtos.NewOrderDTO;
import com.mbhatia.cqrs_example.models.NewOrder;
import java.math.BigInteger;

public interface IOrderCommandService {
    NewOrder createOrder(NewOrderDTO newOrderDTO);
    void deleteOrder(BigInteger orderId);
}
