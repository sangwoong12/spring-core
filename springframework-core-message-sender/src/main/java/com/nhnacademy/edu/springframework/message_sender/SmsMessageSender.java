package com.nhnacademy.edu.springframework.message_sender;

import com.nhnacademy.edu.springframework.User;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SmsMessageSender implements MessageSender, InitializingBean, DisposableBean {
    public SmsMessageSender() {
        System.out.println("SmsMessageSender : initiated");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("    > SmsMessageSender : afterPropertiesSet called");
    }
    public void init(){
        System.out.println("        ㄴ SmsMessageSender : init called");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Sms Message Sent to " + user.getPhoneNumber() + " : " + message);
    }
    public void destory(){
        System.out.println("    ㄴ SmsMessageSender : destory called");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("        > SmsMessageSender : destroy called");
    }
}
