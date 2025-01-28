package com.coherentsolutions.section180;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigurableGreetingService {

    @Value("${ConfigurableGreetingService.greeting}")
    private String greeting;

    public void sayGreeting() {
        System.out.println(greeting);
    }
}
