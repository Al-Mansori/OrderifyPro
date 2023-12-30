package com.FCAI.SE.OrderifyPro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CompoundOrder extends Order{
    private List<Order> innerOrders = new ArrayList<>();

    public CompoundOrder(Account account, List<Order> innerOrders) {
        super(UUID.randomUUID(), account);
        this.innerOrders = innerOrders;
    }

    public boolean addOrder(Order order) {
        return this.innerOrders.add(order);
    }

    public List<Order> getInnerOrders() {
        return innerOrders;
    }

    public void setInnerOrders(List<Order> innerOrders) {
        this.innerOrders = innerOrders;
    }


    
}
