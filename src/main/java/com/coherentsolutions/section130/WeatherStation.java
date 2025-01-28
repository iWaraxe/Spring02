package com.coherentsolutions.section130;

public class WeatherStation {
    private TemperatureSensor sensor;

    public void setSensor(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    public void displayTemperature() {
        double temperature = sensor.readTemperature();
        System.out.println("Current temperature: " + temperature + "°C");
    }
}
