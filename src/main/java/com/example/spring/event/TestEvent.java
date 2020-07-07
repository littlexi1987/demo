package com.example.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEvent {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);
        publisher.publish("aaaaaaaa");
        context.close();
    }
}
