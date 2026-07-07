package com.abishek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Student {

    public Student() {
        System.out.println("Student Bean Created");
    }

    public void display() {
        System.out.println("Welcome to Spring!");
    }
}

public class Main {
    public static void main(String[] args) {

        ApplicationContext c =
                new AnnotationConfigApplicationContext(Student.class);

        Student s = c.getBean(Student.class);

        s.display();
    }
}