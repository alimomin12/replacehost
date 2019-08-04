package com.jivatech.replacehost.repository.entity;

import lombok.Data;

@Data
public class Customer {

    private String name;
    private String customerId;
    private Integer partySize;
    private Integer phoneNumber;
    private String email;

}
