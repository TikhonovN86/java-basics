package org.itmo.lesson6.task4;

public class OutputClass extends InputClass {
    private Integer number;

    public OutputClass(Integer number) {
        super(number);
    }

    public void setNumberForOutputClass(Integer number) {
        this.number = number;
    }

    public void printInputClassNumber() {
        System.out.println("Число из главного класса: " + super.number);
    }

    public void printOutputClassNumber() {
        System.out.println("Число из класса-наследника: " + this.number);
    }
}
