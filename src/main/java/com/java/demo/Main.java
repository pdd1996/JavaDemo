package com.java.demo;

import com.java.demo.reflection.User;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//        int field = User.publicStaticField;
//        System.out.println(field);
//        User.myPublicStaticMethod();

//        User user = new User("paddy", 18);
//        System.out.println("name: " + user.getName() + ", age: " + user.getAge());
//        user.myPublicMethod();

        Class<?> aClass = Class.forName("com.java.demo.reflection.User");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}