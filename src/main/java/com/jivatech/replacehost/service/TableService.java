package com.jivatech.replacehost.service;

import com.jivatech.replacehost.repository.entity.Table;
import com.jivatech.replacehost.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService {

    @Autowired
    TableRepository tableRepository;

    public Table getTable(Integer tableSize) {
        return tableRepository.findTable(true, tableSize);

    }

}
