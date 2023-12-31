package com.FCAI.SE.OrderifyPro.repositories;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.FCAI.SE.OrderifyPro.model.Order;

@Repository
public class OrderRepository {
    public static List<Order> orders = new ArrayList<Order>();

    public void addOrder(Order order) {
        orders.add(order);
    }
    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public Optional<Order> getOrderById (UUID id) {
        return orders.stream().filter(p1 -> p1.getId().equals(id)).findAny();
    }

    public List<Order> getAllOrders () {
        return orders;
    }
}
