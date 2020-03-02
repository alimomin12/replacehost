package com.jivatech.replacehost.repository.impl;
import org.springframework.stereotype.Repository;
import com.jivatech.replacehost.repository.TableRepository;
import com.jivatech.replacehost.repository.entity.Table;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Repository
public class TableRepositoryImpl implements TableRepository {

    ArrayList<Table> tables;

    @PostConstruct
    void setup() {
        tables = new ArrayList<>();
        Table t1 = new Table();
        t1.setTableLocation("bathroom");
        t1.setTableNumber(1);
        t1.setTableSize(5);
        t1.setIsAvailable(true);
        tables.add(t1);

        Table t2 = new Table();
        t2.setTableLocation("kitchen");
        t2.setTableNumber(2);
        t2.setTableSize(5);
        t2.setIsAvailable(true);
        tables.add(t2);
    }


    @Override
    public Table findTable(Boolean isAvailable, Integer partySize) {

        // return tables.stream().filter(table -> (table.getIsAvailable() == isAvailable) && (table.getTableSize() >= partySize)).findFirst().orElse(null);

        Table returnVal = null;
        for (Table table : tables) {
            if ((java.util.Objects.equals(table.getIsAvailable(), isAvailable)) &&
                    (table.getTableSize().intValue() >= partySize.intValue())) {
                returnVal = table;
            }
        }
        return returnVal;
    }

    @Override
    public void changeTableAvailability(Integer tableNumber, Boolean newAvailability) {
        for (Table table : tables) {
            if (java.util.Objects.equals(table.getTableNumber(), tableNumber)) {
                table.setIsAvailable(newAvailability);
            }
        }
    }
}

