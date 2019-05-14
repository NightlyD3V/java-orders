package com.lambda.javaorders.repos;

import com.lambda.javaorders.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Long>
{
    Orders findByName(String name);
}
