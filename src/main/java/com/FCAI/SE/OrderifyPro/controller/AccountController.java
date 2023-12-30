package com.FCAI.SE.OrderifyPro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FCAI.SE.OrderifyPro.model.Account;

import com.FCAI.SE.OrderifyPro.services.IAccountService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    IAccountService accountService;


    @PostMapping("/addAccount")
    public Account addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }
}
