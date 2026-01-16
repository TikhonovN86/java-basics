package org.itmo.lesson3.task3;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setName("Nursing home");
        house1.setConstructionYear(Year.of(1950));
        house1.setFloorsNumber(2);
        System.out.println(house1);
        System.out.printf("age: %d\n", house1.getAge());
        System.out.println();

        House house2 = new House();
        house2.setName("Khrushchyovka");
        house2.setConstructionYear(Year.of(1960));
        house2.setFloorsNumber(5);
        System.out.println(house2);
        System.out.printf("age: %d\n", house2.getAge());
    }
}
