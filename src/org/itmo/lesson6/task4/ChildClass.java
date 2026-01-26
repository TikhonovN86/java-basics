package org.itmo.lesson6.task4;


public class ChildClass extends ParentClass {
    private Integer number;

    public void setNumberForChild(Integer number) {
        this.number = number;
    }

    public void printNumberFromParent() {
        System.out.println("Число из главного класса: " + super.number);
    }

    public void printNumberFromChild() {
        System.out.println("Число из класса-наследника: " + this.number);
    }
}
