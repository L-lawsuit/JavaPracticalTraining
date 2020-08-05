package com.hp.domain;

import java.util.Date;

public class Order {
    private String id;
    private Date create_time;

    private ReceivingAddress receivingAddress;
    private User user;

    public Order() {
    }

    public Order(String id, Date create_time, ReceivingAddress receivingAddress, User user) {
        this.id = id;
        this.create_time = create_time;
        this.receivingAddress = receivingAddress;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", create_time=" + create_time +
                ", receivingAddress=" + receivingAddress +
                ", user=" + user +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public ReceivingAddress getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(ReceivingAddress receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
