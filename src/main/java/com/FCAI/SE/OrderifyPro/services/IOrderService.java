package com.FCAI.SE.OrderifyPro.services;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.springframework.stereotype.Service;
import com.FCAI.SE.OrderifyPro.model.Order;

@Service

public interface IOrderService {
    public boolean addOrder(Order order);
}