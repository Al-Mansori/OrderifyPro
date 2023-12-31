package com.FCAI.SE.OrderifyPro.repositories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.FCAI.SE.OrderifyPro.model.Notification;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

@Repository

public class NotificationQueueRepository {
    private static Queue<Notification> notifications = new LinkedList<Notification>();
    private static Map<String, Integer> phoneFreq = new HashMap<String, Integer>();
    private static Map<String, Integer> templateFreq = new HashMap<String, Integer>();

    public void add(Notification n) {
        notifications.add(n);
    }

    public void removeSent() {
        long currTime = System.currentTimeMillis();
        while (!notifications.isEmpty() && notifications.peek().getTime() <= currTime - (10000)) {
            var n = notifications.poll();
            if (phoneFreq.containsKey(n.getReceiver())) {
                phoneFreq.replace(n.getReceiver(), phoneFreq.get(n.getReceiver()) + 1);
            } else {
                phoneFreq.put(n.getReceiver(), 1);
            }

            if (templateFreq.containsKey(n.getTemplate())) {
                templateFreq.replace(n.getTemplate(), templateFreq.get(n.getTemplate()) + 1);
            } else {
                templateFreq.put(n.getTemplate(), 1);
            }
        }
    }

    public Queue<Notification> getNotifications() {
        return notifications;
    }

    public Map<String, Integer> getMostUsingPhone() {
        return phoneFreq;
    }

    public Map<String, Integer> getMostUsingTemplate() {
        return templateFreq;
    }

}
