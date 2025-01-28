package com.coherentsolutions.section170;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            AlertService alertService = context.getBean(AlertService.class);
            alertService.sendAlert("Severe weather warning!");
        }
    }
}
