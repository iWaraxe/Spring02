package com.coherentsolutions.section160;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherAlertService {
    @Autowired
    private NotificationService notificationService;

    public void sendRainAlert() {
        notificationService.sendAlert("It's going to rain today!");
    }
}
