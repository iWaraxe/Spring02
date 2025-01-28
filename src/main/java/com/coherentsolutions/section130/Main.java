package com.coherentsolutions.section13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            WeatherStation station = context.getBean(WeatherStation.class);
            station.displayTemperature();
        }
    }
}
