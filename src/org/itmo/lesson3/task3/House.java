package org.itmo.lesson3.task3;

import java.time.Year;

public class House {
    private Integer floorsNumber;
    private Year constructionYear;
    private String name;

    public void setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public void setConstructionYear(Year constructionYear) {
        this.constructionYear = constructionYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Year getConstructionYear() {
        return constructionYear;
    }

    public Integer getFloorsNumber() {
        return floorsNumber;
    }

    public Integer getAge() {
        return Year.now().getValue() - this.getConstructionYear().getValue();
    }

    @Override
    public String toString() {
        return name + ": " + "{" +
                "floorsNumber = " + floorsNumber +
                ", constructionYear = " + constructionYear +
                '}';
    }
}
