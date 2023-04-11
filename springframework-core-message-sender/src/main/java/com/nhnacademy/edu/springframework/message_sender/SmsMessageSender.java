package com.nhnacademy.edu.springframework.message_sender;

import com.nhnacademy.edu.springframework.User;

public class SmsMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Sms Message Sent to " + user.getPhoneNumber() + " : " + message);
    }
    public void init(){
        System.out.println("SmsMessageSender init called");
    }
    public void close(){
        System.out.println("SmsMessageSender close called");
    }
}
