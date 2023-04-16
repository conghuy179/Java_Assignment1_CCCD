package vn.funix.fx16513.java.asm03.models;

import vn.funix.fx16513.java.asm02.models.Account;
import vn.funix.fx16513.java.asm02.models.Customer;

/**
 * TIEU CHI 3:
 * Class DigitalCustomer quan ly thong tin khach hang tiem nang
 * ke thua class Customer
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

    /**
     * TIEU CHI 3:
     * Method withdraw: cho phep khach hang rut tien theo tai khoan
     * @param accountNumber: ma TK cua khach hang
     * @param amount: So tien khach hang muon rut
     */
    @Override
    public void withdraw(String accountNumber, double amount) {
        boolean ok = false;
        if (!isAccountExisted(accountNumber)) {
            System.out.println("Tai khoan khong ton tai.");
        } else {
            Account account = searchAccount(accountNumber);
            ok = account.withdraw(amount);
            if (ok) {
                account.log(amount);
            }
        }
    }

    /**
     * Ham hien thi thong tin theo loai tai khoan
     */
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
