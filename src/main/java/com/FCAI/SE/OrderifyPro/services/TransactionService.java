package com.FCAI.SE.OrderifyPro.services;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import com.FCAI.SE.OrderifyPro.model.Account;

public abstract class TransactionService {
    AccountServiceImp accountService = new AccountServiceImp();

        public boolean canAllUsersPay (Map<UUID, Double> moneyPerUser) {
        for (var entry : moneyPerUser.entrySet()) {
            Optional<Account> user = accountService.getUserByID(entry.getKey());
            if (user.get().getBalance() < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public void makeAllUsersPay (Map<UUID, Double> moneyPerUser) {
        for (var entry : moneyPerUser.entrySet()) {
            Account user = accountService.getUserByID(entry.getKey()).get();
            user.setBalance(user.getBalance() - entry.getValue());
        }
    }

}
