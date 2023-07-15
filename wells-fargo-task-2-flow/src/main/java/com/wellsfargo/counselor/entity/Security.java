package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long SecurityId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasedate;

    @Column(nullable = false)
    private String purchaseprice;

    @Column(nullable = false)
    private String quantity;

    @Column(nullable = false)
    private String portfolioid;

    protected Security() {

    }

    public Security(String firstName, String lastName,String category,String purchasedate, String purchaseprice,String quantity,String portfolioid) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.category=category;
        this.purchasedate=purchasedate;
        this.purchaseprice=purchaseprice;
        this.quantity=quantity;
        this.portfolioid=portfolioid;

    }

    public Long getSecurityId() {
        return SecurityId;
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

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }
    public String getPurchasedate() {

        return purchasedate;
    }

    public void setPurchasedate(String purchasedate) {

        this.purchasedate = purchasedate;
    }

    public String getPurchaseprice() {

        return purchaseprice;
    }
    public void setPurchaseprice(String purchaseprice) {

        this.purchaseprice = purchaseprice;
    }

    public String getPortfolioid() {

        return portfolioid;
    }
    public void setPortfolioid(String portfolioid) {

        this.portfolioid = portfolioid;
    }
}


