package com.coherentsolutions.section190;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class SingletonService {

    @PostConstruct
    public void init() {
        System.out.println("SingletonService bean is being initialized.");
    }

    public void performService() {
        System.out.println("Performing service in Singleton scope.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("SingletonService bean is being destroyed.");
    }
}
