package com.FCAI.SE.OrderifyPro.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import java.util.UUID;

class NotificationTemplate {
  
    private UUID id;// templateId

    private String template;
    // private String templateType;
    // private String templateContent;

    private List<String> placeholders;
    private List<String> availableLanguages;
    private List<String> availableChannels;

    // Constructors, getters, setters, etc.
}