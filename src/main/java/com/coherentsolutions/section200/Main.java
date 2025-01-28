package com.coherentsolutions.section200;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            AppSettings appSettings = context.getBean(AppSettings.class);
            appSettings.displaySettings();
        }
    }
}
