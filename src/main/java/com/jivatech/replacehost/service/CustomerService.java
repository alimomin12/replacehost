package com.jivatech.replacehost.service;

import com.jivatech.replacehost.repository.CustomerRepository;
import com.jivatech.replacehost.repository.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer getCustomer(String customerId) {
        return customerRepository.findCustomer(customerId);
    }

    public String createCustomer(Customer customer) {
        String customerId = UUID.randomUUID().toString();
        customer.setCustomerId(customerId);
        customerRepository.createCustomer(customer);
        return customerId;
    }
}
