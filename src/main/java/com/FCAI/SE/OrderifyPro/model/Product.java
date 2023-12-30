package com.FCAI.SE.OrderifyPro.model;

public class Product {
    private ProductDefinition definition;
    private int availableAmount;


    public Product(ProductDefinition definition, int availableAmount) {
        this.definition = definition;
        this.availableAmount = availableAmount;
    }
    public ProductDefinition getDefinition() {
        return definition;
    }
    public void setDefinition(ProductDefinition definition) {
        this.definition = definition;
    }
    public int getAvailableAmount() {
        return availableAmount;
    }
    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }

}
