package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.message_sender.MessageSender;

public class MessageSendService {
    //final 의 경우 setter 로 값 할당 불가능.
    private MessageSender messageSender;

    //ByName : 이름을 통해 bean에서 을 찾아 주입 , 이방법 역시 기본 생성자가 필요함.
    public void setSmsMessageSender(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        User user = new User("timeattacks2@naver.com", "010-4596-5429");
        messageSender.sendMessage(user, "hello");
    }
}
