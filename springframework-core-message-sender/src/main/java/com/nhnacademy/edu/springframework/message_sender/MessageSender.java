package com.nhnacademy.edu.springframework.message_sender;

import com.nhnacademy.edu.springframework.User;

public interface MessageSender {

    void sendMessage(User user, String message);
}
