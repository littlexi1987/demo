package com.example.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String message = demoEvent.getMessage();
        System.out.println("demoListener 收到的消息为: " + message);
    }

}
