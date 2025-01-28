package com.coherentsolutions.section200;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppSettings {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    public void displaySettings() {
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
    }
}
