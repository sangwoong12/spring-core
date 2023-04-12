package com.nhnacademy.edu.springframework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy// Aspect 를 사용하기 위해 추가.
public class ApplicationConfig {
    //MessageSendService 클래스에 직접 bean 등록.
}
