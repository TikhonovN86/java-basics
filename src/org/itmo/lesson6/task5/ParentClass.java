package org.itmo.lesson6.task5;

import java.util.Scanner;

public class ParentClass {
    protected Scanner sc;

    public ParentClass() {
        sc = new Scanner(System.in);
    }

    public Integer getUserAge() {
        int age;

        System.out.print("Введите возраст пользователя: ");
        age = sc.nextInt();
        System.out.println("Возраст пользователя: " + age);
        return age;
    }

    public String getUserName() {
        String name;

        System.out.print("Введите имя пользователя: ");
        name = sc.nextLine();
        System.out.println("Имя пользователя из главного класса: " + name);

        return name;
    }
}
