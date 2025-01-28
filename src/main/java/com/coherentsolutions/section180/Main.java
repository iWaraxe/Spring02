package com.coherentsolutions.section180;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            GreetingService greetingService = context.getBean(GreetingService.class);
            greetingService.sayGreeting();

            ConfigurableGreetingService configurableGreetingService = context.getBean(ConfigurableGreetingService.class);
            configurableGreetingService.sayGreeting();

            CalculationService calculationService = context.getBean(CalculationService.class);
            calculationService.printResult();
        }
    }
}
