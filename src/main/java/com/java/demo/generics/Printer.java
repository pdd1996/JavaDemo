package com.java.demo.generics;

public class Printer<T, V> {
    T content;
    V content2;
    public Printer(T content, V content2) {
        this.content = content;
        this.content2 = content2;
    }
    public void print() {
        System.out.println(content);
        System.out.println(content2);
    }
}
