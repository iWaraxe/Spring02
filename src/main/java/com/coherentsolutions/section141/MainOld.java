package com.coherentsolutions.section141;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainOld {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigOld.class)) {
            WeatherService service = context.getBean(WeatherService.class);
            service.displayTemperature();
        }
    }
}
