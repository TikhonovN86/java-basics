package org.itmo.lesson2;

//Класс по заданию №2 лабораторной работы №2;
public class Employee {
    private final boolean isReadyForPromotion = false;
    private String name;
    private String position;
    private Integer salary;

    public Employee() {}

    public Employee(String name, String position, Integer salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public boolean isReadyForPromotion() {
        return isReadyForPromotion;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
