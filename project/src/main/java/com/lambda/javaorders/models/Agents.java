package com.lambda.javaorders.models;

import javax.persistence.*;

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
}
