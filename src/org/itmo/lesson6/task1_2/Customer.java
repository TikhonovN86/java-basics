package org.itmo.lesson6.task1_2;

public class Customer extends Human {
    private final String bankName;

    public Customer(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Customer info: " + "\n" +
                "First name: " + getFirstName() + "\n" +
                        "Last name: " + getLastName() + "\n" +
                        "Bank name: " + getBankName()
        );
    }
}
