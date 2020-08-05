package com.hp.domain;

import org.apache.catalina.User;

import java.math.BigInteger;

public class ReceivingAddress {
    private String id;
    private String receiving_address;
    private String receiving_person;
    private BigInteger mobile_phone;
    private Integer is_default;

    private User user;

    public ReceivingAddress() {
    }

    public ReceivingAddress(String id, String receiving_address, String receiving_person, BigInteger mobile_phone, Integer is_default, User user) {
        this.id = id;
        this.receiving_address = receiving_address;
        this.receiving_person = receiving_person;
        this.mobile_phone = mobile_phone;
        this.is_default = is_default;
        this.user = user;
    }

    @Override
    public String toString() {
        return "ReceivingAddress{" +
                "id='" + id + '\'' +
                ", receiving_address='" + receiving_address + '\'' +
                ", receiving_person='" + receiving_person + '\'' +
                ", mobile_phone=" + mobile_phone +
                ", is_default=" + is_default +
                ", user=" + user +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiving_address() {
        return receiving_address;
    }

    public void setReceiving_address(String receiving_address) {
        this.receiving_address = receiving_address;
    }

    public String getReceiving_person() {
        return receiving_person;
    }

    public void setReceiving_person(String receiving_person) {
        this.receiving_person = receiving_person;
    }

    public BigInteger getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(BigInteger mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public Integer getIs_default() {
        return is_default;
    }

    public void setIs_default(Integer is_default) {
        this.is_default = is_default;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
