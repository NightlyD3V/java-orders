package com.lambda.javaorders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "odrers")
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderid;

    @Column(nullable = false)
    private long ordnum;
    private double ordamount;
    private double advanceamount;
    private String orddescription;

    //one to many relationships
    @OneToMany(mappedBy = "customers", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("customers")
    private List<Customers> custcode = new ArrayList<>();

    @OneToMany(mappedBy = "agents", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("agents")
    private List<Agents> agentcode = new ArrayList<>();

    public Orders()
    {
    }

    public Orders(long ordnum, double ordamount, double advanceamount, String orddescription, List<Customers> custcode, List<Agents> agentcode)
    {
        this.ordnum = ordnum;
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.orddescription = orddescription;
        this.custcode = custcode;
        this.agentcode = agentcode;
    }

    public long getOrderid()
    {
        return orderid;
    }

    public void setOrderid(long orderid)
    {
        this.orderid = orderid;
    }

    public long getOrdnum()
    {
        return ordnum;
    }

    public void setOrdnum(long ordnum)
    {
        this.ordnum = ordnum;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount)
    {
        this.advanceamount = advanceamount;
    }

    public String getOrddescription()
    {
        return orddescription;
    }

    public void setOrddescription(String orddescription)
    {
        this.orddescription = orddescription;
    }

    public List<Customers> getCustcode()
    {
        return custcode;
    }

    public void setCustcode(List<Customers> custcode)
    {
        this.custcode = custcode;
    }

    public List<Agents> getAgentcode()
    {
        return agentcode;
    }

    public void setAgentcode(List<Agents> agentcode)
    {
        this.agentcode = agentcode;
    }
}
