package com.FCAI.SE.OrderifyPro.model;

import java.util.UUID;

//represents an {([**IMMUTABLE**])} order
public abstract class Order {
    private UUID id;
    private UUID accountID;


    public Order(UUID accountID) {
        this.id = UUID.randomUUID();
        this.accountID = accountID;
    }

    // public Order(UUID id, Account account) {
    // // public Order (UUID id){
    //     this.id = id;
    //     this.accountID = account.getId();
    // }
    public UUID getId() {
        return id;
    }
    public UUID getAccountID() {
        return accountID;
    }
}
