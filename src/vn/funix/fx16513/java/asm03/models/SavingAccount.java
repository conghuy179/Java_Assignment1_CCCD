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

    @Override
    public void log(double amount) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("       BIEN LAI GIAO DICH SAVINGS");
        System.out.println("NGAY G/D:          %28s%n");
        System.out.println("ATM ID:          DIGITAL-BANK-ATM 2022");
        System.out.printf("SO TK:                             %s\n", getAccountNumber());
        System.out.printf("SO TIEN:                       %,.0fđ\n", amount);
        System.out.printf("SO DU:                         %,.0fđ\n",getBalance());
        System.out.printf("PHI + VAT:                     %,.0fđ\n",getFee(amount));
        System.out.println("+----------+-------------------------+----------+");
    }

    @Override
    public boolean withdraw(double amount) {
        if (isAccepted(amount)) {
            setBalance(getBalance() - getFee(amount) - amount);
            return true;
        }
        return false;
    }

    @Override
    public boolean isAccepted(double amount) {
        if (amount < 50_000) {
            return false;
        }
        if (!isPremium() && amount > SAVINGS_ACCOUNT_MAX_WITHDRAW) {
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
