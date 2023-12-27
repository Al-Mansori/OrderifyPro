package com.FCAI.SE.OrderifyPro.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

class Order {

    private String id; // orderId

    // @ManyToOne
    private Customer customer;

    // @OneToMany
    private List<Product> products;

    // private String status;
    // private String shippingAddress;
    // private boolean isShipped;
    // private double shippingFees;

    // Other order details, shipping info

    // Constructors, getters, setters, etc.
}