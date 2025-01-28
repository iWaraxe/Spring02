package com.coherentsolutions.section180;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    @Value("Hello, Spring!")
    private String greeting;

    public void sayGreeting() {
        System.out.println(greeting);
    }
}
