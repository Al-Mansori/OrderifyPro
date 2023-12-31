package com.FCAI.SE.OrderifyPro.model;

import java.util.UUID;

public class Shipment {
    private UUID orderId;
    private boolean isDelivered;
    
    
    private long time;
    
    public Shipment(UUID orderId) {
        this.orderId = orderId;
        this.isDelivered = false;
        this.time = System.currentTimeMillis();
    }
    
    
    public boolean canCancel() {
        return System.currentTimeMillis() - time < (1000*60*5);
    }
    
    
    public UUID getOrderId() {
        return orderId;
    }
    
    
    public boolean isDelivered() {
        return isDelivered;
    }
    
    public void setDelivered(boolean isDelivered) {
        this.isDelivered = isDelivered;
    }
    
    public long getTime() {
        return time;
    }       
}
