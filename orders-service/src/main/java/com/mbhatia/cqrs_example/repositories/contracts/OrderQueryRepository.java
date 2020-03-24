package com.mbhatia.cqrs_example.repositories.contracts;

import com.mbhatia.cqrs_example.models.NewOrder;
//import com.mbhatia.cqrs_example.models.OrderQuery;
import java.math.BigInteger;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderQueryRepository extends ReactiveMongoRepository<NewOrder, BigInteger> {
}
