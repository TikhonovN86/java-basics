package org.itmo.lesson6.task4;

public class Main4 {
    public static void main(String[] args) {
        ChildClass ch1 = new ChildClass();
        ch1.setNumberForParent();
        ch1.printNumberFromParent();
        ch1.setNumberForChild(100);
        ch1.printNumberFromChild();
    }
}
