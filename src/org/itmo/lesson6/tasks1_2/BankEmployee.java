package org.itmo.lesson6.tasks1_2;

public class BankEmployee extends Human {
    private final String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
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
                "Bank employee info: " + "\n" +
                        "First name: " + getFirstName() + "\n" +
                        "Last name: " + getLastName() + "\n" +
                        "Bank name: " + getBankName()
        );
    }
}
