package com.FCAI.SE.OrderifyPro.services;


import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.apache.coyote.BadRequestException;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import com.FCAI.SE.OrderifyPro.model.Order;

public class CheckoutService extends TransactionService {
    OrderServiceImp orderService = new OrderServiceImp();
    InventoryService inventoryService = new InventoryService();

    public Order checkout (Order order) throws BadRequestException {
        Map<UUID, Double> costPerUser = order.calculateCostPerUser();
        if (canAllUsersPay(costPerUser) && inventoryService.isValidOrder(order)) {
            inventoryService.removeFromInventory(order);
            makeAllUsersPay(costPerUser);
            orderService.addOrder(order);
            return order;
        }

        throw new BadRequestException();
    }

    public void cancelCheckout (UUID orderId) throws BadRequestException {
        Optional<Order> orderToDelete = orderService.getOrderById(orderId);

        if (!orderToDelete.isPresent()) {
            throw new BadRequestException();
        }

        inventoryService.addToInventory(orderToDelete.get());
        orderService.removeOrder(orderToDelete.get());
    }

}
