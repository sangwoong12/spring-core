package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.message_sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageSendService {
//    @Autowired
    private MessageSender messageSender;

    //Type 이 하나만 존재할때 Autowired를 할경우 beans.xml 에 명시해주지 않아도 자동으로 주입된다. 생성자 없이 field 에 선언해주어도 된다.
    //2개 이상일 경우 Qualifier 로 지정해줄수 있다.
    @Autowired
    public void setMessageSender(@Qualifier("smsMessageSender") MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        User user = new User("timeattacks2@naver.com", "010-4596-5429");
        messageSender.sendMessage(user, "hello");
    }
}
