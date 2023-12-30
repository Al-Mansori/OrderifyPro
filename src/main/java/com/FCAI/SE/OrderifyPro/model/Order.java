package com.FCAI.SE.OrderifyPro.model;

import java.util.UUID;

public abstract class Order {
    private UUID id;
    private Account account;


    public Order(UUID id, Account account) {
        this.id = id;
        this.account = account;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}
