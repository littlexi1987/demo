package com.example.spring.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TestClass {

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    public void work() {
        System.out.println("work");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }


}
