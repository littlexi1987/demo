package com.example.spring.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
        System.out.println("---------start---------");
        Thread.sleep(5000 * 5);
        context.close();
        System.out.println("---------stop---------");
    }

}
