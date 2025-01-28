package com.coherentsolutions.section141;

import org.springframework.stereotype.Component;

public class TemperatureSensor {
    private final String id;

    public TemperatureSensor(String id) {
        this.id = id;
    }

    public double readTemperature() {
        // Simulate reading the temperature
        return 22.5;
    }
}
