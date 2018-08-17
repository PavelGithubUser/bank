package com.example.bank.repository;

import com.example.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

//@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    @Query(value="select * from customer where id=2", native=true)
//    Customerrr findById();

//    @Transactional
//    @Modifying
//    @Query("update Customer c set c.amount = :AMOUNT where c.id = :ID")
//    public void update(@Param("ID") Long id, @Param("AMOUNT") double amount);

    @Query("select c from Customer c where c.account = :ACCOUNT")
    public Customer getByAccount(@Param("ACCOUNT") String account);

}
