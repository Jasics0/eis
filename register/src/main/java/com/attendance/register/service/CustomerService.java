package com.attendance.register.service;

import com.attendance.register.model.Customer;
import com.attendance.register.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> findAll() {
        List<Customer> customers = customerRepository.findAll();
        log.info("Customers: {}", customers);
        return customers;
    }

}
