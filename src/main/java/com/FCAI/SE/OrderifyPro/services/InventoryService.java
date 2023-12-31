package com.FCAI.SE.OrderifyPro.services;

import java.util.Map;
import java.util.UUID;

import com.FCAI.SE.OrderifyPro.model.Order;
import com.FCAI.SE.OrderifyPro.repositories.ProductRepository;

public class InventoryService {
    ProductRepository productRepository = new ProductRepository();

    public boolean isValidOrder(Order order) {
        Map<UUID, Integer> quantityPerItem = order.getQuantityPerItem();

        for (var orderItem : quantityPerItem.entrySet()) {
            if (productRepository.getProductById((orderItem.getKey())).get().getAvailableAmount() < orderItem
                    .getValue()) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidOrder(Map<UUID, Integer> quantityPerItem) {
        for (var orderItem : quantityPerItem.entrySet()) {
            if (productRepository.getProductById((orderItem.getKey())).get().getAvailableAmount() < orderItem
                    .getValue()) {
                return false;
            }
        }
        return true;
    }

    public void removeFromInventory(Order order) {
        Map<UUID, Integer> quantityPerItem = order.getQuantityPerItem();

        if (isValidOrder(quantityPerItem)) {
            for (var orderItem : quantityPerItem.entrySet()) {
                productRepository.getProductById(orderItem.getKey()).get().setAvailableAmount(
                        productRepository.getProductById(orderItem.getKey()).get().getAvailableAmount()
                                - orderItem.getValue());
            }

            return;
        }

        System.out.println("handle this error or something. go get a job you poor man");
    }


    public void addToInventory (Order order) {
        for (var orderItem : order.getQuantityPerItem().entrySet()) {
            productRepository.getProductById(orderItem.getKey()).get().setAvailableAmount(
                    productRepository.getProductById(orderItem.getKey()).get().getAvailableAmount()
                            + orderItem.getValue());
        }
    }

}
