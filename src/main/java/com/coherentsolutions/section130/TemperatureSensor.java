package com.coherentsolutions.section130;

public class TemperatureSensor {
    private final String sensorId;

    public TemperatureSensor(String sensorId) {
        this.sensorId = sensorId;
    }

    public double readTemperature() {
        // Simulate reading temperature
        return 25.3; // For simplicity, returning a fixed value
    }
}
