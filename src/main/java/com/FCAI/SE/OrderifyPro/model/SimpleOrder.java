package com.FCAI.SE.OrderifyPro.model;

import java.util.*;

public class SimpleOrder extends Order{
    private List<Product> products;

    public SimpleOrder(UUID accountId, List<Product> products) {
        super(accountId);
        this.products = Collections.unmodifiableList(products);
    }

    // public boolean addProduct (Product product) {
    //     return products.add(product);
    // }



    public List<Product> getProducts() {
        return products;
    }

    // public void setProducts(List<Product> products) {
    //     this.products = products;
    // }

    // private String status;
    // private String shippingAddress;
    // private boolean isShipped;
    // private double shippingFees;

    // Other order details, shipping info
    
}