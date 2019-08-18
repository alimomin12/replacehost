package com.jivatech.replacehost.controller;

import com.jivatech.replacehost.repository.entity.Customer;
import com.jivatech.replacehost.repository.entity.Table;
import com.jivatech.replacehost.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class TableController {


    @Autowired
    TableService tableService;

    @RequestMapping(value = "/table/{tableNumber}"), method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Table> getTable(@PathVariable(value = "tableNumber", required = true) String tableNumber) {
        return new ResponseEntity<>(tableService.getTable(tableNumber), HttpStatus.OK);
    }

    @RequestMapping(value = "/table", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.createCustomer(customer), HttpStatus.OK);
    }
}
