package org.itmo.lesson3.task2;

import static org.itmo.lesson3.task2.Color.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(BLACK);
        car1.setWeight(2.1);
        car1.setName("Audi A7");

        Car car2 = new Car(1.52 , PINK);
        car2.setName("changan cs55 plus ultra 2000");

        System.out.println(car1);
        System.out.println(car2);
    }
}
