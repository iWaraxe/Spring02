package com.coherentsolutions.section150;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring context from AppConfig
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            WeatherStation station = context.getBean(WeatherStation.class);
            station.displayWeather(); // Display the current weather status
        }
    }
}
