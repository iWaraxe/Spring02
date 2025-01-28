package com.coherentsolutions.section170;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AlertService {

    private final NotificationService notificationService;

    @Autowired
    public AlertService(@Qualifier("smsService") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendAlert(String message) {
        notificationService.send(message);
    }
}
