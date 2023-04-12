package com.nhnacademy.edu.springframework.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.nhnacademy.edu.springframework")
public class MessageSenderConfig {
    //클래스에 직접 bean 등록을 해주었다.
}
