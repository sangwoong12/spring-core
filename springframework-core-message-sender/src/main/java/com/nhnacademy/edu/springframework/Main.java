package com.nhnacademy.edu.springframework;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        User user = new User("timeattacks2@naver.com", "010-4596-5429");
        main.sendEmailMessage(user,"hello");
        main.sendSmsMessage(user,"hello");

    }
    public void sendSmsMessage(User user,String message){
        System.out.println("Sms Message Sent to"+user.getPhoneNumber() + " : " +message);
    }
    public void sendEmailMessage(User user,String message){
        System.out.println("Email Message Sent to"+user.getEmail() + " : " +message);
    }
}