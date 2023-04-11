package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.message_sender.SmsMessageSender;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.nhnacademy.edu.springframework")
public class MessageSenderConfig {
    //beans.xml 와 동일하게 어노테이션으로 설정가능.
    //beans.xml 에 따로 설정 안해줘도 동일하게 동작한다.
    @Bean(initMethod = "init", destroyMethod = "close")
    @Scope("singleton")
    public SmsMessageSender smsMessageSender() {
        return new SmsMessageSender();
    }
}
