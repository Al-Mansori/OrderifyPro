package com.FCAI.SE.OrderifyPro.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FCAI.SE.OrderifyPro.model.*;
import com.FCAI.SE.OrderifyPro.services.*;


@RestController
@RequestMapping("/orders")
public class OrderController {
    IOrderService orderService;

    

    public OrderController(@Qualifier("orderServiceImp") IOrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/simple")
    public Order addSimpleOrder(@RequestBody SimpleOrder order) {
        return orderService.addOrder(order);
        
    }

    @PostMapping("/compound")
    public Order addCompoundOrder(@RequestBody CompoundOrder order) {
        return orderService.addOrder(order);
    }
}
