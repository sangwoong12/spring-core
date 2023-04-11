package com.nhnacademy.edu.springframework.message_sender;

import com.nhnacademy.edu.springframework.User;

public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    }
}
