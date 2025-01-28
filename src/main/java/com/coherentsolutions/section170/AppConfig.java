package com.coherentsolutions.section170;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.coherentsolutions.section170")
public class AppConfig {
    // No explicit bean definitions are needed due to @ComponentScan
}
