package com.FCAI.SE.OrderifyPro.repositories;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.FCAI.SE.OrderifyPro.model.Order;

@Repository
public class OrderRepository {
    public static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }
}
