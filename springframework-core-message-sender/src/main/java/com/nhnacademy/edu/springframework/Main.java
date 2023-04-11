package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.message_sender.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            //init 확인을 위해 singleton 으로 bean설정 변경.
            // 생성자 -> afterPropertiesSet() -> init() 순으로 출력되는 것을 확인
            //InitializingBean : 컴포넌트에 스프링프레임워크의 의존성이 발생함으로 권장하지 않는다.
            System.out.println("---------- doSendMessage ----------");
            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("---------- doSendMessage ----------");
        }
    }
}