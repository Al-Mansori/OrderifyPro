package com.FCAI.SE.OrderifyPro.model;


public class Account {

    // private String id;
    // private List<Order> ordersPlaced;
    private String email;
    private String password;
    private double accountBalance;

    public Account(String email, String password, double accountBalance) {
        this.email = email;
        this.password = password;
        this.accountBalance = accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}