package com.nhnacademy.edu.springframework.message_sender;

import com.nhnacademy.edu.springframework.User;
import com.nhnacademy.edu.springframework.annotation.ElapsedTimeLog;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {

    @Override @ElapsedTimeLog
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    }
}
