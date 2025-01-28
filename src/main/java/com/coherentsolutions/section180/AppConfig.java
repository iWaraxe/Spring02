package com.coherentsolutions.section180;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.coherentsolutions.section180")
@PropertySource("classpath:application.properties")
public class AppConfig {
    // Configuration class
}
