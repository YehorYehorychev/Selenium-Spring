package com.yehorychev.spring.spring_selenium.repository;

import com.yehorychev.spring.spring_selenium.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
