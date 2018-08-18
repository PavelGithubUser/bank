package com.example.bank.repository;

import com.example.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

//@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("select c from Customer c where c.account = :ACCOUNT")
    public Customer getByAccount(@Param("ACCOUNT") String account);

    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Customer c WHERE c.account = :ACCOUNT")
    boolean existsByAccount(@Param("ACCOUNT") String account);

}
