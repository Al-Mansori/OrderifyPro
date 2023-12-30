package com.FCAI.SE.OrderifyPro.services;

import org.springframework.stereotype.Service;

import com.FCAI.SE.OrderifyPro.model.Account;

@Service

public interface IAccountService {
    public Account addAccount(Account account);
}
