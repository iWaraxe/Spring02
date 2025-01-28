package com.coherentsolutions.section190;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            System.out.println("Context initialized.\n");

            System.out.println("SingletonService:");
            SingletonService singletonService1 = context.getBean(SingletonService.class);
            SingletonService singletonService2 = context.getBean(SingletonService.class);
            System.out.println(singletonService1 == singletonService2); // Should print true

            System.out.println("\nPrototypeService:");
            PrototypeService prototypeService1 = context.getBean(PrototypeService.class);
            PrototypeService prototypeService2 = context.getBean(PrototypeService.class);
            System.out.println(prototypeService1 != prototypeService2); // Should print true

            // The LifecycleService's init and destroy methods are called automatically
        }
    }
}
