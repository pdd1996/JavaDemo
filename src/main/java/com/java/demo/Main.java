package com.java.demo;

import com.java.demo.stream.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 20),
                new Person("Jane", 21)
        );
        System.out.println("Hello World!");
    }
}