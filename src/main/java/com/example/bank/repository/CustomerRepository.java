package com.example.bank.repository;

import com.example.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer getByAccount(String account);

    @Query("SELECT CASE WHEN c.amount >= :AMOUNT THEN true ELSE false END FROM Customer c WHERE c.account = :ACCOUNT")
    boolean isEnough(@Param("ACCOUNT") String account, @Param("AMOUNT") double amount);

    boolean existsByAccount(String account);

}
