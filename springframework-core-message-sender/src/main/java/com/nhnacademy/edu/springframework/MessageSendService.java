package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.message_sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSendService {
    @Autowired
    private MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    public void doSendMessage() {
        User user = new User("timeattacks2@naver.com", "010-4596-5429");
        messageSender.sendMessage(user, "hello");
    }
}
