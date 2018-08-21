package com.example.bank.service;

import com.example.bank.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    boolean isExist(String account);

    boolean isEnough(String account, double amount);

    Customer gerCustomerByID (long id);

    Customer getByAccount(String account);

}
