package com.FCAI.SE.OrderifyPro.services;

import java.util.*;

import com.FCAI.SE.OrderifyPro.model.Notification;
import com.FCAI.SE.OrderifyPro.model.NotificationTemplate;

public interface INotificationService {
    public void add(Notification notification);

    public Map<String, Integer> getByReceiver();

    public Map<String, Integer> getByTemplate();

    public Queue<Notification> getAllNotifications();

    public void setOrderPlacement(NotificationTemplate notificationTemplate);

    public void setOrderShipment(NotificationTemplate notificationTemplate);
}