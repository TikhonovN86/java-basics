package org.itmo.lesson6.task5;

import java.util.Scanner;

public class ChildClass extends ParentClass {
    @Override
    public String getUserName() {
        String name;

        System.out.print("Введите имя пользователя: ");
        name = sc.nextLine();
        System.out.println("Имя пользователя из касса-наследника: " + name);

        return name;
    }
}
