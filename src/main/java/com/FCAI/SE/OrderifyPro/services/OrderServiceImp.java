package com.FCAI.SE.OrderifyPro.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.FCAI.SE.OrderifyPro.model.Order;
import com.FCAI.SE.OrderifyPro.repositories.OrderRepository;

@Service("orderServiceImp")

public class OrderServiceImp implements IOrderService {

    OrderRepository orderRepository = new OrderRepository();

    

    @Override
    public Order addOrder(Order order) {
        orderRepository.addOrder(order);
        return order;
    }

    public void removeOrder(Order order) {
        orderRepository.removeOrder(order);
    }



    @Override
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }



    @Override
    public Optional<Order> getOrderById(UUID id) {
        return orderRepository.getOrderById(id);
    }

    


}
