package com.example.bank.repository;

import com.example.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
//    @Query(value="select * from customer where id=2", native=true)
//    Customerrr findById();

}
