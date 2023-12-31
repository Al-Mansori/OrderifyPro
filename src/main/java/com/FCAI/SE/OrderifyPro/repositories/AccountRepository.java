package com.FCAI.SE.OrderifyPro.repositories;

import com.FCAI.SE.OrderifyPro.model.Account;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
        public static List<Account> accounts = new ArrayList<>();

        public boolean addAccount(Account account) {
                return accounts.add(account);
        }
}
