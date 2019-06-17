package com.jivatech.replacehost.repository.entity;

import lombok.Data;

@Data
public class Customer {

    private String name;
    private Integer customerId;
    private Integer partySize;
    private Integer phoneNumber;
    private String email;

}
