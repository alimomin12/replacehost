package com.jivatech.replacehost.repository;

import com.jivatech.replacehost.repository.entity.Table;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository {
    Table findTable(Boolean isAvailable, Integer partySize);

    void changeTableAvailability(Integer tableNumber, Boolean newAvailability);



}
