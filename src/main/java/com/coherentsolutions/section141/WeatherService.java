package com.coherentsolutions.section141;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class WeatherService {
    private final TemperatureSensor sensor;

    public WeatherService(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    public void displayTemperature() {
        System.out.println("Current temperature: " + sensor.readTemperature() + "°C");
    }
}
