package com.FCAI.SE.OrderifyPro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PostExchange;

import com.FCAI.SE.OrderifyPro.model.Notification;
import com.FCAI.SE.OrderifyPro.model.NotificationTemplate;
import com.FCAI.SE.OrderifyPro.services.INotificationService;
import com.FCAI.SE.OrderifyPro.services.NotificationServiceImp;

import java.util.Map;
import java.util.Queue;

import javax.xml.namespace.QName;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    // RESTful endpoints for notification management
    INotificationService notificationService = new NotificationServiceImp();

    @PostMapping("/")
    public Notification postMethodName(@RequestBody Notification notification) {
        notificationService.add(notification);
        return notification;
    }

    @GetMapping("/stats/byReceiver")
    public Map<String, Integer> statsByReceiver() {
        return notificationService.getByReceiver();
    }

    @GetMapping("/stats/byTemplate")
    public Map<String, Integer> statsByTemplate() {
        return notificationService.getByTemplate();
    }

    @GetMapping("/")
    public Queue<Notification> getMethodName() {
        return notificationService.getAllNotifications();
    }

    @PostMapping("/templates/orderPlacement")
    public NotificationTemplate setOrderPlacement(@RequestBody NotificationTemplate notificationTemplate) {
        notificationService.setOrderPlacement(notificationTemplate);
        return notificationTemplate;
    }

    @PostMapping("/templates/orderShipment")
    public NotificationTemplate setOrderShipment(@RequestBody NotificationTemplate notificationTemplate) {
        notificationService.setOrderShipment(notificationTemplate);
        return notificationTemplate;
    }

}
