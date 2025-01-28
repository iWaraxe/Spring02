package com.coherentsolutions.section150;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.coherentsolutions.section150") // Adjust to match your package structure
public class AppConfig {
    // No bean definitions are needed here due to @ComponentScan
}
