package com.FCAI.SE.OrderifyPro.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.FCAI.SE.OrderifyPro.model.Account;
import com.FCAI.SE.OrderifyPro.repositories.AccountRepository;

@Service("AccountServiceImp")

public class AccountServiceImp implements IAccountService {

    AccountRepository accountRepository = new AccountRepository();


    @Override
    public Account addAccount(Account account) {
        boolean isAdded = accountRepository.addAccount(account);
        if (isAdded) {
            return account;
        }
        return null;
    }

    public Optional<Account> getUserByID (UUID userId) {
        return accountRepository.getAccountById(userId);
    }

}
