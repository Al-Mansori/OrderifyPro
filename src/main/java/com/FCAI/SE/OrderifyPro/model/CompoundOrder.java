package com.FCAI.SE.OrderifyPro.model;

import java.util.*;

public class CompoundOrder extends Order {
    private List<Order> innerOrders;

    public CompoundOrder(UUID accountId, List<Order> innerOrders) {
        super(accountId);
        this.innerOrders = Collections.unmodifiableList(innerOrders);
    }

    public List<Order> getInnerOrders() {
        return innerOrders;
    }

    public Map<UUID, Double> distributeShippingFee(Double shippingFee) {
        Map<UUID, Double> res = new HashMap<>();
        for (Order order : innerOrders) {
            for (var entry : order.distributeShippingFee(shippingFee/innerOrders.size()).entrySet()) {
                if (res.containsKey(entry.getKey())) {
                    res.replace(entry.getKey(), res.get(entry.getKey()) + entry.getValue());
                } else {
                    res.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return res;
    }

    public Map<UUID, Double> calculateCostPerUser() {
        Map<UUID, Double> res = new HashMap<>();
        for (Order order : innerOrders) {
            for (var entry : order.calculateCostPerUser().entrySet()) {
                if (res.containsKey(entry.getKey())) {
                    res.replace(entry.getKey(), res.get(entry.getKey()) + entry.getValue());
                } else {
                    res.put(entry.getKey(), entry.getValue());
                }
            }

        }

        return res;
    }

}
