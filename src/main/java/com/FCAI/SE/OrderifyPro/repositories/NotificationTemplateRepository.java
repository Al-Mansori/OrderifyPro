package com.FCAI.SE.OrderifyPro.repositories;

import org.springframework.stereotype.Repository;

import com.FCAI.SE.OrderifyPro.model.NotificationTemplate;

@Repository

public class NotificationTemplateRepository {
    public static NotificationTemplate orderPlacement = new NotificationTemplate();
    public static NotificationTemplate orderShipment = new NotificationTemplate();

    public NotificationTemplate getOrderPlacement() {
        return orderPlacement;
    }

    public NotificationTemplate getOrderShipment() {
        return orderShipment;
    }

    public void setOrderPlacement(NotificationTemplate orderPlacement) {
        NotificationTemplateRepository.orderPlacement = orderPlacement;
    }

    public void setOrderShipment(NotificationTemplate orderShipment) {
        NotificationTemplateRepository.orderShipment = orderShipment;
    }

}
