package com.java.demo.reflection;

import java.util.List;

public class User extends Person{
    public String name;
    private final int age;
    private String email;
    private Message message;
    private List<String> comments;
    public static int publicStaticField = 1;
    private static final int privateStaticField = 10;

    static {
        System.out.println("UserClass is initialized");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
        this.age = 18;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void myPublicMethod() {
        System.out.println("this is a public method");
    }

    private void myPrivateMethod() {
        System.out.println("this is a private method");
    }

    public void myPrivateMethod(String content, String mark) {
        System.out.println("this is a private method with parameter" + content + " " + mark);
    }
    public static void myPublicStaticMethod() {
        System.out.println("this is a public static method");
    }

    private static void myPrivateStaticMethod() {
        System.out.println("this is a private static method");
    }
}
