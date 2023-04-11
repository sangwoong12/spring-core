package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.message_sender.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
            MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);

            User user = new User("timeattacks2@naver.com", "010-4596-5429");

            smsMessageSender.sendMessage(user, "hello");
            emailMessageSender.sendMessage(user, "hello");

        }
    }
}