package com.lambda.javaorders.services;

import com.lambda.javaorders.models.Agents;
import com.lambda.javaorders.repos.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value = "AgentsService")
public class AgentsServiceImpl
{
    @Autowired
    private AgentsRepository agentrepos;

    @Transactional
    @Override
    public Agents save(Agents agents)
    {
        Agents newAgent = new Agents();

        newAgent.setAgentname(agents.getAgentname());
        newAgent.setCommision(agents.getCommision());
        newAgent.setCountry(agents.getCountry());
        newAgent.setPhone(agents.getPhone());
        newAgent.setWorkingarea(agents.getWorkingarea());

        return agentrepos.save(newAgent);
    }
}
