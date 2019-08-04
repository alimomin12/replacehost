package com.jivatech.replacehost.repository.impl;

import com.jivatech.replacehost.repository.CustomerRepository;
import com.jivatech.replacehost.repository.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    ArrayList<Customer> customers;

    @PostConstruct
    void setup() {
        customers = new ArrayList<>();
    }

    @Override
    public void createCustomer(Customer customer) {
        if (customer.getCustomerId() != null) {
            customers.add(customer);
        }
    }

    @Override
    public Customer findCustomer(String customerId) {
        Customer customer = null;
        if (customerId != null) {
            for (Customer c : customers) {
                if (c.getCustomerId().equals(customerId)) {
                    customer = c;
                    break;
                }
            }
        }
        return customer;
    }
}
