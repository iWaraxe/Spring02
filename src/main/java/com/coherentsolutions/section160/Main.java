package com.coherentsolutions.section160;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            WeatherAlertService alertService = context.getBean(WeatherAlertService.class);
            alertService.sendRainAlert(); // This demonstrates the use of the injected NotificationService
        }
    }
}
