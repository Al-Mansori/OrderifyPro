package com.FCAI.SE.OrderifyPro.services;

import org.springframework.stereotype.Service;

import com.FCAI.SE.OrderifyPro.model.Order;

@Service

public interface IOrderService {
    public Order addOrder(Order order);
}