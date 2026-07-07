package com.abishek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Engine {

    public Engine() {
        System.out.println("Engine Bean Created");
    }
}

@Component
class Car {

    @Autowired
    Engine e;

    public void drive() {
        System.out.println("Car is using Engine");
    }
}

public class Main {

    public static void main(String[] args) {

        ApplicationContext c =
                new AnnotationConfigApplicationContext(
                        "com.abishek");

        Car car = c.getBean(Car.class);

        car.drive();
    }
}