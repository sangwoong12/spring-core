package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.message_sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class MessageSendService {
    private MessageSender messageSender;

    //반드시 의존성이 주입되어야 함을 강제하는 Annotation 이다.
    //아래의 경우 beans.xml 에서 의존성 주입을 설정하지 않을 경우 컴파일 전에 오류를 잡아준다.
    @Required
    public void setSmsMessageSender(MessageSender messageSender) {
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
