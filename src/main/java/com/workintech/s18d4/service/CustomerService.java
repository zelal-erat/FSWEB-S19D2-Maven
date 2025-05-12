package com.workintech.s18d4.service;

import com.workintech.s18d4.entity.Customer;
import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer save(Customer customer);
    List<Customer> findAll();
    Customer find(Long id);

    Customer delete(Long id);
}