package com.FCAI.SE.OrderifyPro.services;


import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import com.FCAI.SE.OrderifyPro.model.Account;
import com.FCAI.SE.OrderifyPro.model.Order;

public class CheckoutService {
    AccountServiceImp accountService = new AccountServiceImp();

    public boolean canAllUsersPay (Map<UUID, Double> moneyPerUser) {
        for (var entry : moneyPerUser.entrySet()) {
            Optional<Account> user = accountService.getUserByID(entry.getKey());
            if (user.) {
                
            }
        }
    }

    public void checkout (Order order) {
        Map<UUID, Double> costPerUser = order.calculateCostPerUser();



    }
}
