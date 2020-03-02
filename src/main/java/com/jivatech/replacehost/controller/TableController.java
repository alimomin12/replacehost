package com.jivatech.replacehost.controller;

import com.jivatech.replacehost.repository.entity.Table;
import com.jivatech.replacehost.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TableController {


    @Autowired
    TableService tableService;

    @RequestMapping(value = "/table/{tableSize}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Table> getTable(@PathVariable(value = "tableSize", required = true) Integer tableSize) {
        return new ResponseEntity<>(tableService.getTable(tableSize), HttpStatus.OK);
    }

}
