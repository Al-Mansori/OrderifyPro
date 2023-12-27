package com.FCAI.SE.OrderifyPro.services;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.springframework.stereotype.Service;
import org.apache.commons.math3.stat.descriptive.summary.Product;

@Service

public interface IOrderService {
    public boolean addOrder(Order order);
}