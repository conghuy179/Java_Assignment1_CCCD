package vn.funix.fx16513.java.asm02.models;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isPremium() {
        return balance >= 10_000_000;
    }

    public void toStringAccount() {
        System.out.println(accountNumber + "|                " + balance);
    }
}
