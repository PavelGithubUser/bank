package com.example.bank.entity;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER", schema = "", catalog = "")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    private Long id;

    @Basic
    @Column(name = "FIRSTNAME", nullable = false, insertable = true, updatable = true, length = 255)
    private String firstName;

    @Basic
    @Column(name = "LASTNAME", nullable = false, insertable = true, updatable = true, length = 255)
    private String lastName;

    @Basic
    @Column(name = "ACCOUNT", nullable = false, insertable = true, updatable = true, length = 255)
    private String account;

    @Basic
    @Column(name = "AMOUNT", nullable = false, insertable = true, updatable = true, length = 255)
    private double amount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
