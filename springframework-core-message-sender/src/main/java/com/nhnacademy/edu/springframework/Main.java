package com.nhnacademy.edu.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.config")){
            MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);
            messageSendService.doSendMessage();
        }
    }
}