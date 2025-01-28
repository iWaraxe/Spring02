package com.coherentsolutions.section150;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeatherStation {
    private RainSensor rainSensor;

    // The @Autowired annotation on the setter method for RainSensor
    @Autowired
    public void setRainSensor(RainSensor rainSensor) {
        this.rainSensor = rainSensor;
    }

    public void displayWeather() {
        if (rainSensor != null && rainSensor.isRaining()) {
            System.out.println("It's raining.");
        } else {
            System.out.println("It's not raining.");
        }
    }
}
