package vn.funix.fx16513.java.asm02.models;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Account> accounts;

    public Customer(String name, String customerID) {
        // setCustomerID(customerID);
        super(name, customerID);
        this.accounts = new ArrayList<Account>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public boolean isPremium() {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).isPremium()) {
                return true;
            }
        }
        return false;
    }

    public boolean isAccountExisted(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accountNumber.equals(accounts.get(i).getAccountNumber())) {
                return true;
            }
        }
        return false;
    }

    public void addAccount(Account newAccount) {
        boolean isAccountExisted = isAccountExisted(newAccount.getAccountNumber());
        if (!isAccountExisted) {
            accounts.add(newAccount);
        } else {
            System.out.println("Tai khoan da ton tai.");
        }
    }

    public double getBalance() {
        double totalBalance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            totalBalance += accounts.get(i).getBalance();
        }
        return totalBalance;
    }

    public void displayInformation() {
        String customerType = isPremium() ? "Premium" : "Normal";

        System.out.printf("%s | %s | %s | %,.2f\n", getCustomerID(), getName(), customerType, getBalance());
        for (int i = 0; i < accounts.size(); i++) {
            System.out.printf("%d\t\t%s\t\t\t\t%,.2f\n", (i + 1), accounts.get(i).getAccountNumber(), accounts.get(i).getBalance());
        }
    }
}
