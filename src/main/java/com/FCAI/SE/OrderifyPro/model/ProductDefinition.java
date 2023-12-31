package com.FCAI.SE.OrderifyPro.model;

import java.util.UUID;

public class ProductDefinition {

    private UUID serialNumber;
    private String name;
    private String vendor;
    private String category;
    private double price;

    public ProductDefinition(UUID serialNumber, String name, String vendor, String category, double price) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.vendor = vendor;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public UUID getSerialNumber() {
        return serialNumber;
    }

    public String getVendor() {
        return vendor;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSerialNumber(UUID serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

}