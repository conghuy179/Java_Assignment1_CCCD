package vn.funix.fx16513.java.asm02.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Customer, ke thua class User.
 * List<Account>: Chua thong tin khach hang cua ngan hang.
 *
 */
public class Customer extends User {
    private List<Account> accounts;

    /**
     * Constructor Customer:
     * @param name: Super ten tu user.
     * @param customerID: Super CCCD tu user.
     */
    public Customer(String name, String customerID) {
        // setCustomerID(customerID);
        super(name, customerID);
        this.accounts = new ArrayList<Account>();
    }

    /**
     * Ham lay danh sach cac tai khoan cua khach hang.
     * @return Danh sach cac tai khoan cua khach hang.
     */
    public List<Account> getAccounts() {
        return accounts;
    }

    /**
     * Ham kiem tra khach hang co phai premium hay khong.
     * @return Neu co 1 tai khoan premium, return true, neu khong return false.
     */

    public boolean isPremium() {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).isPremium()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Ham kiem tra su ton tai cua tai khoan
     * @param accountNumber: Ma so tai khoan
     * @return Neu tim thay ma so tai khoan trong danh sach tai khoan
     *         cua khach hang, return true.
     *         Neu khong tim thay, return false.
     */
    public boolean isAccountExisted(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accountNumber.equals(accounts.get(i).getAccountNumber())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Ham them tai khoan moi cho khach hang (Chi khi ma so tai khoan chua ton tai).
     * @param newAccount: Tai khoan moi.
     */
    public void addAccount(Account newAccount) {
        boolean isAccountExisted = isAccountExisted(newAccount.getAccountNumber());
        if (!isAccountExisted) {
            accounts.add(newAccount);
        } else {
            System.out.println("Tai khoan da ton tai.");
        }
    }

    /**
     * Ham tinh toan tong so du cua khach hang.
     * @return Tong so du tu tat ca tai khoan.
     */
    public double getBalance() {
        double totalBalance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            totalBalance += accounts.get(i).getBalance();
        }
        return totalBalance;
    }

    /**
     * Ham hien thi thong tin chi tiet tai khoan
     */
    public void displayInformation() {
        String customerType = isPremium() ? "Premium" : "Normal";

        System.out.printf("%s | %s | %s | %,.2f\n", getCustomerID(), getName(), customerType, getBalance());
        for (int i = 0; i < accounts.size(); i++) {
            System.out.printf("%d\t\t%s\t\t\t\t%,.2f\n", (i + 1), accounts.get(i).getAccountNumber(), accounts.get(i).getBalance());
        }
    }
}
