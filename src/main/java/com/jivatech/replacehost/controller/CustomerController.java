package com.jivatech.replacehost.controller;

import com.jivatech.replacehost.repository.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @RequestMapping(value = "/student/{studentId}")
    public @ResponseBody Customer getTestData(@PathVariable Integer customerId) {
        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setName("Mr. Poopy Buttface");
        customer.setPartySize(5);
        return customer;
    }
}
