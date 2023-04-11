package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.message_sender.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            // destroy() -> destory 순으로 init 의 역순으로 진행.
            System.out.println("---------- doSendMessage ----------");
            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("---------- doSendMessage ----------");
        }
    }
}