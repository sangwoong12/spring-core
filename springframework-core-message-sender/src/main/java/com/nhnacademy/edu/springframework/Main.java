package com.nhnacademy.edu.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            //constructor ref 로 명시하기 때문에 같은 Type 이 존재해서 에러발생 X
            context.getBean("messageSendService",MessageSendService.class).doSendMessage();
        }
    }
}