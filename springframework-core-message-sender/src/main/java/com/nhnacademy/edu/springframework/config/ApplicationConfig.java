package com.nhnacademy.edu.springframework.config;

import com.nhnacademy.edu.springframework.MessageSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Autowired
    private MessageSenderConfig messageSenderConfig;
    //위와 동일하다.
//    @Autowired
//    public ApplicationConfig(MessageSenderConfig messageSenderConfig){
//        this.messageSenderConfig = messageSenderConfig;
//    }
    @Bean
    public MessageSendService messageSendService(){
        return new MessageSendService(messageSenderConfig.smsMessageSender());
    }
}
