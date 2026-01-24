package org.itmo.lesson6.task4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main4 {
    public static void main(String[] args) {
        OutputClass outputClass = new OutputClass(100);
        outputClass.setNumberForOutputClass(20);
        outputClass.printInputClassNumber();
        outputClass.printOutputClassNumber();
    }
}
