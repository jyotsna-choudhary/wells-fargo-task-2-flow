package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Clients extends Portfolios {

    @Id
    @GeneratedValue()
    private long ClientsId;



    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String portfolio;

    @Column(nullable = false)
    private String advisorid;



    public Clients(String firstName, String lastName, String address, String phone, String email,String portfolio,String advisorid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.portfolio=portfolio;
        this.advisorid=advisorid;

    }

    public Clients() {

    }


    public Long getClientsId() {
        return ClientsId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
    public String getportfolio() {

        return portfolio;
    }

    public void setportfolio(String portfolio) {

        this.portfolio = portfolio;
    }
    public String getadvisorid() {

        return advisorid;
    }

    public void setadvisorid(String advisorid) {

        this.advisorid = advisorid;
    }
}
