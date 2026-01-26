package org.itmo.lesson6.task5;

import java.util.Scanner;

public class ChildClass extends ParentClass {

    @Override
    public void printParentAge() {
        System.out.print("Укажите имя пользователя: ");
        super.name = sc.nextLine();
        System.out.println("Имя пользователя: " + super.name);
    }
}
