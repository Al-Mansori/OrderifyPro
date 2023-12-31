package com.FCAI.SE.OrderifyPro.services;

import java.util.Map;
import java.util.Queue;

import com.FCAI.SE.OrderifyPro.model.Notification;
import com.FCAI.SE.OrderifyPro.model.NotificationTemplate;
import com.FCAI.SE.OrderifyPro.repositories.NotificationQueueRepository;
import com.FCAI.SE.OrderifyPro.repositories.NotificationTemplateRepository;

public class NotificationServiceImp implements INotificationService {
    NotificationQueueRepository queueRepository = new NotificationQueueRepository();
    NotificationTemplateRepository templateRepository = new NotificationTemplateRepository();

    public void add(Notification notification) {
        queueRepository.add(notification);
    }

    public Map<String, Integer> getByReceiver() {
        queueRepository.removeSent();
        return queueRepository.getMostUsingPhone();
    }

    public Map<String, Integer> getByTemplate() {
        queueRepository.removeSent();
        return queueRepository.getMostUsingTemplate();
    }

    public Queue<Notification> getAllNotifications() {
        queueRepository.removeSent();
        return queueRepository.getNotifications();
    }

    public void setOrderPlacement(NotificationTemplate notificationTemplate) {
        templateRepository.setOrderPlacement(notificationTemplate);
    }

    public void setOrderShipment(NotificationTemplate notificationTemplate) {
        templateRepository.setOrderShipment(notificationTemplate);
    }

}
