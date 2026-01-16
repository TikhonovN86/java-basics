package org.itmo.lesson3.task4;

public class Tree {
    private Integer age;
    private Boolean isAlive;
    private String purpose;

    public Tree(Integer age, String purpose) {
        this.age = age;
        this.purpose = purpose;
    }

    public Tree(Integer age, Boolean isAlive, String purpose) {
        this.age = age;
        this.isAlive = isAlive;
        this.purpose = purpose;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
