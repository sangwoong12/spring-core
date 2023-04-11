package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.message_sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.message_sender.MessageSender;
import com.nhnacademy.edu.springframework.message_sender.SmsMessageSender;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.nhnacademy.edu.springframework")
public class MessageSenderConfig {

    @Bean
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

    @Bean
    public MessageSender emailMessageSender() {
        return new EmailMessageSender();
    }
}
