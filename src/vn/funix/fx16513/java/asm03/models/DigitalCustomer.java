package vn.funix.fx16513.java.asm03.models;

import vn.funix.fx16513.java.asm02.models.Account;
import vn.funix.fx16513.java.asm02.models.Customer;
import vn.funix.fx16513.java.asm03.util.Withdraw;

/**
 * Class quan ly thong tin khach hang tiem nang
 */

public class DigitalCustomer extends Customer {
    /**
     * Constructor Customer:
     *
     * @param name       : Super ten tu user.
     * @param customerID : Super CCCD tu user.
     */
    public DigitalCustomer(String name, String customerID) {
        super(name, customerID);
    }

    @Override
    public void withdraw(String accountNumber, double amount) {
        if (!isAccountExisted(accountNumber)) {
            System.out.println("Tai khoan khong ton tai.");
        } else {
            Account account = searchAccount(accountNumber);
            boolean ok = account.withdraw(amount);
            if (ok) {
                account.log(amount);
            }
        }
    }

    @Override
    public void displayInformation() {
        String customerType = isPremium() ? "Premium" : "Normal";

        System.out.printf("%s | %s | %s | %,.0fđ\n",
                getCustomerID(),
                getName(),
                customerType,
                getBalance());
        for (int i = 0; i < getAccounts().size(); i++) {
            System.out.printf("%d | %s | %s | \t\t%,.0fđ\n",
                    (i + 1),
                    getAccounts().get(i).getAccountNumber(),
                    getAccounts().get(i).getAccountType(),
                    getAccounts().get(i).getBalance());
        }
    }
}
