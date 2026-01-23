package org.itmo.lesson6;

import org.itmo.lesson6.task3.Truck;
import org.itmo.lesson6.task4.InputClass;
import org.itmo.lesson6.task4.OutputClass;

public class Main {
    public static void main(String[] args) {
        InputClass.number = 100;

        OutputClass outputClass = new OutputClass();
        outputClass.outputNumber();
    }
}
