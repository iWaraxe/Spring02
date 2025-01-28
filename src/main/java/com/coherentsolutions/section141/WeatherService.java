package com.coherentsolutions.section14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private final TemperatureSensor sensor;

    @Autowired
    public WeatherService(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    public void displayTemperature() {
        System.out.println("Current temperature: " + sensor.readTemperature() + "°C");
    }
}
