package com.coherentsolutions.section142;

import org.springframework.stereotype.Component;

@Component
public class TemperatureSensor {
    // Simulated field, no need for constructor injection for simplicity
    private final String id = "defaultSensorId";

    public double readTemperature() {
        // Simulate reading the temperature
        return 22.4;
    }
}