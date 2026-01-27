package org.itmo.lesson7;

public class Main {
    public static void main(String[] args) {
        Aircraft aircraft1 = new Aircraft();
        aircraft1.setWingsWeight(21.5, 22.1);

        Aircraft aircraft2 = new Aircraft();
        aircraft2.setWingsWeight(15.2, 18.1);

        aircraft1.displayWingsWeight();
        aircraft2.displayWingsWeight();
    }
}
