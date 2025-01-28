package com.coherentsolutions.section13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public TemperatureSensor temperatureSensor() {
        return new TemperatureSensor("Sensor123");
    }

    @Bean
    public WeatherStation weatherStation(TemperatureSensor sensor) {
        WeatherStation station = new WeatherStation();
        station.setSensor(sensor);
        return station;
    }
}
