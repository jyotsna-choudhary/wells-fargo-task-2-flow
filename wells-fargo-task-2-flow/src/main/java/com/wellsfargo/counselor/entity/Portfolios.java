package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolios extends Security {

    @Id
    @GeneratedValue()
    private long PortfoliosId;


    @Column(nullable = false)
    private String securities;

    @Column(nullable = false)
    private String clientsid;

    protected Portfolios() {

    }

    public Portfolios(String clientsid, String securities) {
        this.clientsid=clientsid;
        this.securities=securities;
    }

    public Long getclientidd() {
        return PortfoliosId;
    }


    public String getclientsid() {

        return clientsid;
    }

    public void setclientsid(String clientsid) {

        this.clientsid = clientsid;
    }
    public String getsecurities() {

        return securities;
    }

    public void setsecurities(String securities) {

        this.securities = securities;
    }
}
