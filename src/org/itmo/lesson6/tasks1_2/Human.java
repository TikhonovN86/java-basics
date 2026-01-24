package org.itmo.lesson6.tasks1_2;

public abstract class Human implements BankOperations {
    private final String firstName;
    private final String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract void printInfo();
}
