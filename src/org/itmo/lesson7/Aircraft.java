package org.itmo.lesson7;

public class Aircraft {
    private Wing firstWing = new Wing();
    private Wing secondWing = new Wing();

    public static class Wing {
        private Double weight;

        public void setWeight(Double weight) {
            this.weight = weight;
        }

        public Double getWeight() {
            return weight;
        }
    }

    public void setWingsWeight(Double weight1, Double weight2) {
        firstWing.setWeight(weight1);
        secondWing.setWeight(weight2);
    }

    public void displayWingsWeight() {
        System.out.println("Вес первого крыла: " + firstWing.getWeight());
        System.out.println("Вес второго крыла: " + secondWing.getWeight());
    }
}