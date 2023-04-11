package com.nhnacademy.edu.springframework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//MessageSendService는 아직 bean 등록을 안했기 때문에 필요.
@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {
}