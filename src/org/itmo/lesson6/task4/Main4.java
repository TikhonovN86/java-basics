package org.itmo.lesson6.task4;

public class Main4 {
    public static void main(String[] args) {
        InputClass.number = 100;
        OutputClass.number = 200;

        OutputClass outputClass = new OutputClass();
        outputClass.outputNumber();
    }
}
