package com.java.demo.generics;

public class StringPrinter {
    String content;
    public StringPrinter(String content){
        this.content = content;
    }

    public void print(){
        System.out.println(content);
    }
}
