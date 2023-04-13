package vn.funix.fx16513.java.asm03.models;

import vn.funix.fx16513.java.asm02.models.Account;

/**
 * Class quan ly tai khoan cua khach hang
 */
public class LoanAccount extends Account {
    public static final double LOAN_ACCOUNT_WITHDRAW_FEE = 0.05;
    public static final double LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE = 0.01;
    public static final double LOAN_ACCOUNT_MAX_BALANCE = 100_000_000;

    /**
     * Constructor cua Loan Account:
     *
     * @param accountNumber : So tai khoan khach hang.
     * @param balance       : So du tai khoan.
     */
    public LoanAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void log(double amount) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("       BIEN LAI GIAO DICH LOAN");
        System.out.printf("NGAY G/D:          %28s%n", Utils.getDateTime());
        System.out.println("+----------+-------------------------+----------+");
    }
    @Override
    public boolean withdraw(double amount) {
        if (isAccepted(amount)) {
            double fee = isPremium()? LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE * amount : LOAN_ACCOUNT_WITHDRAW_FEE * amount;
            setBalance(getBalance() - fee - amount);
            return true;
        }
        return false;
    }
    @Override
    public boolean isAccepted(double amount) {
        if (amount > LOAN_ACCOUNT_MAX_BALANCE) {
            return false;
        }
        double fee = isPremium()? LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE * amount : LOAN_ACCOUNT_WITHDRAW_FEE * amount;
        if (getBalance() - fee - amount > 50_000) {
            return false;
        }
        return true;
    }

    @Override
    public String getAccountType() {
        return "LOAN";
    }
}
