package com.mbhatia.cqrs_example.repositories.contracts;

import com.mbhatia.cqrs_example.models.NewOrder;
import java.math.BigInteger;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface OrderCommandRepository extends MongoRepository<NewOrder, BigInteger> {
}
