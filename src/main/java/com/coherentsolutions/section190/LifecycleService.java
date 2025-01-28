package com.coherentsolutions.section190;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleService {

    @PostConstruct
    public void init() {
        System.out.println("LifecycleService bean is being initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("LifecycleService bean is being destroyed.");
    }
}
