package com.example.spring.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructDestroy {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestClass.class);
        TestClass testClass = context.getBean(TestClass.class);
        testClass.work();
        context.close();
    }

}
