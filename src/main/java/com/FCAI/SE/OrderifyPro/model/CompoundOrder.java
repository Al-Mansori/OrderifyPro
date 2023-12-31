package com.FCAI.SE.OrderifyPro.model;

import java.util.*;

public class CompoundOrder extends Order{
    private List<Order> innerOrders;

    public CompoundOrder(UUID accountId, List<Order> innerOrders) {
        super(accountId);
        this.innerOrders = Collections.unmodifiableList(innerOrders);
    }

    // public boolean addOrder(Order order) {
    //     return this.innerOrders.add(order);
    // }

    public List<Order> getInnerOrders() {
        return innerOrders;
    }

    // public void setInnerOrders(List<Order> innerOrders) {
    //     this.innerOrders = innerOrders;
    // }


    
}
