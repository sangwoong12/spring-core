package com.nhnacademy.edu.springframework.message_sender;

import com.nhnacademy.edu.springframework.User;
import org.springframework.beans.factory.InitializingBean;

public class SmsMessageSender implements MessageSender, InitializingBean {
    public SmsMessageSender() {
        System.out.println("SmsMessageSender : initiated");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("    > SmsMessageSender : afterPropertiesSet called");
    }
    public void init(){
        System.out.println("        ㄴ SmsMessageSender : init called");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Sms Message Sent to " + user.getPhoneNumber() + " : " + message);

    }
}
