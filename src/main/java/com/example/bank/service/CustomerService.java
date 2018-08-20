package com.example.bank.service;

import com.example.bank.entity.Customer;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomers();

    public boolean isExist(String account);

    boolean isEnough(String account, double amount);

    public Customer gerCustomerByID (long id);

    Customer getByAccount(String account);

}
