package com.FCAI.SE.OrderifyPro.controller;

import java.util.List;
import java.util.UUID;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FCAI.SE.OrderifyPro.model.*;
import com.FCAI.SE.OrderifyPro.services.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/orders")
public class OrderController {
    IOrderService orderService;
    CheckoutService checkoutService = new CheckoutService();
    ShipmentService shipmentService = new ShipmentService();

    

    public OrderController(@Qualifier("orderServiceImp") IOrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
    

    @PostMapping("/")
    public Order addOrder(@RequestBody Order order) throws BadRequestException {
        return checkoutService.checkout(order);
    }

    @DeleteMapping("/{orderId}")
    public UUID deleteOrder(@PathVariable("orderId") UUID orderId) throws BadRequestException{
        checkoutService.cancelCheckout(orderId);
        return orderId;
    }


    @PostMapping("/{orderId}/ship")
    public UUID shipOrder(@PathVariable("orderId") UUID orderId) throws BadRequestException {
        shipmentService.ship(orderId);
        return orderId;
    }

    @DeleteMapping("/{orderId}/ship")
    public UUID deleteShipping(@PathVariable("orderId") UUID orderId){
        // enter logic

        return orderId;
    }


    


    // @PostMapping("/simple")
    // public Order addSimpleOrder(@RequestBody SimpleOrder order) {
    //     return orderService.addOrder(order);
        
    // }

    // @PostMapping("/compound")
    // public Order addCompoundOrder(@RequestBody CompoundOrder order) {
    //     return orderService.addOrder(order);
    // }
}
