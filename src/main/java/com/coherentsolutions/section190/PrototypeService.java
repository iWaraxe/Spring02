package com.coherentsolutions.section190;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class PrototypeService {

    @PostConstruct
    public void init() {
        System.out.println("PrototypeService bean is being initialized.");
    }

    public void performService() {
        System.out.println("Performing service in Prototype scope.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PrototypeService bean is being destroyed.");
    }
}
