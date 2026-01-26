package org.itmo.lesson6.task5;

import java.util.Scanner;

public class ParentClass {
    Integer age;
    String name;
    protected Scanner sc;

    public ParentClass() {
        sc = new Scanner(System.in);
    }

    public void printParentAge() {
        System.out.print("Укажите возраст пользователя: ");
        age = sc.nextInt();
        System.out.println("Возраст пользователя: " + age);
    }
}
