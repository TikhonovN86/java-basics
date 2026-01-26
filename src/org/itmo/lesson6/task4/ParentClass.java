package org.itmo.lesson6.task4;

import java.util.Scanner;

public class ParentClass {
    protected Integer number;
    protected Scanner sc;

    public ParentClass() {
        sc = new Scanner(System.in);
    }

    public void setNumberForParent() {
        System.out.println("Введите число для главного класса: ");
        this.number = sc.nextInt();
    }
}
