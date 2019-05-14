package com.lambda.javaorders.repos;

import com.lambda.javaorders.models.Agents;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agents, Long>
{
    Agents findByName(String name);
}
