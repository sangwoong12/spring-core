package com.nhnacademy.edu.springframework.message_sender;

import com.nhnacademy.edu.springframework.User;

public class EmailMessageSender implements MessageSender {
    public EmailMessageSender() {
        System.out.println("EmailMessageSender : initiated");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to "+user.getEmail() + " : " +message);
    }
}
