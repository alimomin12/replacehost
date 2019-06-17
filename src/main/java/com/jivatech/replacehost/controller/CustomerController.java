package com.jivatech.replacehost.controller;

import com.jivatech.replacehost.repository.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Customer> getCustomer(@PathVariable(value = "customerId", required = true) String customerId) {
        Customer customer =  new Customer();
        customer.setName("John");
        customer.setCustomerId(1);
        customer.setPartySize(5);
        customer.setPhoneNumber(0);
        customer.setEmail("john.doe@email.com");
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
