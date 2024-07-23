package com.java.demo.rambda;

public class Sms implements Message{
    String sms;

    public Sms() {
    }
    @Override
    public void send() {
        System.out.println("this is a sms.");
    }
}
