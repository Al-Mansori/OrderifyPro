package com.FCAI.SE.OrderifyPro.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Notification {
    private int notificationId;
    private String sender;
    private String receiver;
    private String notificationType;
    private NotificationTemplate templateUsed;
    private String content;
    private boolean isSent;

    // Constructor, getters, setters for Notification class
    // Implement methods as needed: sendNotification, createNotification
}