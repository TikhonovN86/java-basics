package org.itmo.lesson6.task3;

public class Truck extends Car {
    private Integer countWheels;
    private Double maxWeight;

    public Truck(int w, String m, char c, float s, Integer countWheels, Double maxWeight) {
        super(w, m, c, s);
        this.countWheels = countWheels;
        this.maxWeight = maxWeight;
    }

    public void newWheels(Integer w) {
        this.countWheels = w;
        System.out.println(countWheels);
    }
}
