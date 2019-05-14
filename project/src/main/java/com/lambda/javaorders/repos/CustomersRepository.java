package com.lambda.javaorders.repos;

import com.lambda.javaorders.models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long>
{
    Customers findByName(String name);
}
