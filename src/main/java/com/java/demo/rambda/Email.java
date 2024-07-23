package com.java.demo.rambda;

public class Email implements Message{
    String email;

    public Email() {
    }

    @Override
    public void send() {
        System.out.println("this is an email.");
    }
}
