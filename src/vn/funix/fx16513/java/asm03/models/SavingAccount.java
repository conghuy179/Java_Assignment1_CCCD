package vn.funix.fx16513.java.asm03.models;

import vn.funix.fx16513.java.asm02.models.Account;

/**
 * Class quan ly tai khoan tiet kiem cua khach hang
 */
public class SavingAccount extends Account {
    public static final double SAVINGS_ACCOUNT_MAX_WITHDRAW = 5_000_000;

    /**
     * Constructor cua Account:
     *
     * @param accountNumber : So tai khoan khach hang.
     * @param balance       : So du tai khoan.
     */
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void log(double amount) {
        System.out.println("This is log from ReportService");
    }

    public boolean withdraw(double amount) {
        return false;
    }

    @Override
    public boolean isAccepted(double amount) {
        if (amount < 50_000) {
            return false;
        }
        if (!isPremium() && amount > 5_000_000) {
            return false;
        }
        if (getBalance() - amount < 50_000) {
            return false;
        }
        if (amount % 10_000 != 0) {
            return false;
        }
        return true;
    }

    @Override
    public String getAccountType() {
        return "SAVINGS";
    }

}
