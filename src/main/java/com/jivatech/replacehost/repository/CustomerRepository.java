package com.jivatech.replacehost.repository;

import com.jivatech.replacehost.repository.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository {
    void createCustomer(Customer customer);
    Customer findCustomer(String customerId);
}
