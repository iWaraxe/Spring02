package com.coherentsolutions.section200;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.coherentsolutions.section200")
@PropertySource("classpath:app.properties")
public class AppConfig {
    // Configuration class to load properties
}
