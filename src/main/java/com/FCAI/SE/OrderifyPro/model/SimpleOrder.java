package com.FCAI.SE.OrderifyPro.model;

import java.util.*;

public class SimpleOrder extends Order {
    private List<OrderItem> items;
    private String address;

    public SimpleOrder(UUID accountId, List<OrderItem> items, String address) {
        super(accountId);
        this.items = Collections.unmodifiableList(items);
        this.address = address;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getAddress() {
        return address;
    }

    public Map<UUID, Double> distributeShippingFee(Double shippingFee) {
        Map<UUID, Double> res = new HashMap<>();
        res.put(getAccountID(), shippingFee);
        return res;
    }

    public Map<UUID, Double> calculateCostPerUser() {
        double totalCost = 0;
        for (OrderItem item : items) {
            totalCost += (item.getQuantity() * item.getProduct().getDefinition().getPrice());
        }

        Map<UUID, Double> res = new HashMap<>();
        res.put(getAccountID(), totalCost);
        return res;
    }
}