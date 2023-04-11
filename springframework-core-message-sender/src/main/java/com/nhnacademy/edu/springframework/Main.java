package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.message_sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.message_sender.MessageSender;
import com.nhnacademy.edu.springframework.message_sender.SmsMessageSender;

public class Main {
    public static void main(String[] args) {
        MessageSender smsMessageSender = new SmsMessageSender();
        MessageSender emailMessageSender = new EmailMessageSender();

        MessageSendService sms = new MessageSendService(smsMessageSender);
        MessageSendService email = new MessageSendService(emailMessageSender);

        sms.doSendMessage();
        email.doSendMessage();
    }
}