package com.FCAI.SE.OrderifyPro.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.FCAI.SE.OrderifyPro.model.Order;

@Service

public interface IOrderService {
    public Order addOrder(Order order);
    public List<Order> getAllOrders();
}