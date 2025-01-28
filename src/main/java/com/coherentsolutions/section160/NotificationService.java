package com.coherentsolutions.section160;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendAlert(String message) {
        System.out.println("Alert: " + message);
    }
}
