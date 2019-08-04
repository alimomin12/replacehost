package com.jivatech.replacehost.repository.entity;

import lombok.Data;

@Data
public class Customer {

    private String name;
    private Integer customerId;
    private Integer partySize;
    private Integer phoneNumber;
    private String email;

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getPartySize() {
        return partySize;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }


    public void setName(String newName) {
        name = newName;
    }

    public void setCustomerId(int newCustomerId) {
        customerId = newCustomerId;
    }

    public void setPartySize(int newPartySize) {
        partySize = newPartySize;
    }

    public void setPhoneNumber(int newNumber) {
        phoneNumber = newNumber;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }


}
