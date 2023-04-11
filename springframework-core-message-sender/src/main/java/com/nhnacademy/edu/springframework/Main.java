package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.message_sender.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            //singleton : 호출하기전에 생성 되기 때문에 아래보다 먼저 생성자 메세지 출력 & 싱글턴이기 때문에 여러번 호출해도 한번만 생성자가 호출됨.
            System.out.println("---------------------------------");
            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("---------------------------------");
            new MessageSendService(context.getBean("smsMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("---------------------------------");
            //prototype : 호출시 생성 되기 때문에 호출과 동시에 생성자 메세지 출력
            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("---------------------------------");
            new MessageSendService(context.getBean("emailMessageSender", MessageSender.class)).doSendMessage();
            System.out.println("---------------------------------");

        }
    }
}