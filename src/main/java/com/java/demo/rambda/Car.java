package com.java.demo.rambda;

/**
 * 具体的实现是由这个接口的class提供的
 */
public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car started");
    }
}
