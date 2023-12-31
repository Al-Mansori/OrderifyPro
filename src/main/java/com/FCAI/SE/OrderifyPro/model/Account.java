package com.FCAI.SE.OrderifyPro.model;

import java.util.UUID;

public class Account {

    
    private UUID id;
    private String username;
    private String password;
    private double balance;
    
    // private List<Order> ordersPlaced;
    
    
    // public Account(Account otherAccount) {
    // id = UUID.randomUUID();
    // this.username = otherAccount.username;
    // this.password = otherAccount.password;
    // this.balance = otherAccount.balance;
    //}
    

    public Account(String email, String password, double accountBalance) {
        id = UUID.randomUUID();
        this.username = email;
        this.password = password;
        this.balance = accountBalance;
    }

    public void setBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public void setUsername(String email) {
        this.username = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}