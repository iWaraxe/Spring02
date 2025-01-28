package com.coherentsolutions.section14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainNew {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigNew.class)) {
            WeatherService service = context.getBean(WeatherService.class);
            service.displayTemperature();
        }
    }
}