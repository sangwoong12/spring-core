package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.message_sender.MessageSender;

public class MessageSendService {
    //final 의 경우 setter 로 값 할당 불가능.
    private MessageSender messageSender;

// Setter Injection 기본 생성자가 필요하다.
// 아래와 같이 선언할 경우 에러가 발생. MESSAGE : 기본 생성자 필요
//    public MessageSendService(MessageSender messageSender) {
//        this.messageSender = messageSender;
//    }


    public MessageSendService() {
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        User user = new User("timeattacks2@naver.com", "010-4596-5429");
        messageSender.sendMessage(user, "hello");
    }
}
