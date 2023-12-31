package com.FCAI.SE.OrderifyPro.model;

import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonSubTypes.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;


//represents an {([**IMMUTABLE**])} order

@JsonTypeInfo(use = Id.NAME,
              include = JsonTypeInfo.As.PROPERTY,
              property = "type")
@JsonSubTypes({
    @Type(value = SimpleOrder.class, name = "simple"),
    @Type(value = CompoundOrder.class, name = "compound"),
    })



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

    public abstract Map<UUID, Double> calculateCostPerUser();
    public abstract Map<UUID, Double> distributeShippingFee(Double shippingFee);

}
