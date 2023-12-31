package com.FCAI.SE.OrderifyPro.repositories;

import com.FCAI.SE.OrderifyPro.model.Account;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
        public static List<Account> accounts = new ArrayList<Account>();

        public boolean addAccount(Account account) {
                return accounts.add(account);
        }

        public Optional<Account> getAccountById(UUID id) {
                return accounts.stream().filter(p1 -> p1.getId().equals(id)).findAny();
        }
}
