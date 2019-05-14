package com.lambda.javaorders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agents")
public class Agents
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long agentid;

    @Column(nullable = false)
    private String agentname;
    private String workingarea;
    private double commision;
    private String phone;
    private String country;

    @OneToMany(mappedBy = "agents", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties( "agents")
    private List<Customers> customers = new ArrayList<>();

    public Agents()
    {
    }

    public Agents(String agentname, String workingarea, double commision, String phone, String country)
    {
        this.agentname = agentname;
        this.workingarea = workingarea;
        this.commision = commision;
        this.phone = phone;
        this.country = country;
    }

    public long getAgentid()
    {
        return agentid;
    }

    public void setAgentid(long agentid)
    {
        this.agentid = agentid;
    }

    public String getAgentname()
    {
        return agentname;
    }

    public void setAgentname(String agentname)
    {
        this.agentname = agentname;
    }

    public String getWorkingarea()
    {
        return workingarea;
    }

    public void setWorkingarea(String workingarea)
    {
        this.workingarea = workingarea;
    }

    public double getCommision()
    {
        return commision;
    }

    public void setCommision(double commision)
    {
        this.commision = commision;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
}
