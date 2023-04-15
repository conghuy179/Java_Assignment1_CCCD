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
        addNewTransaction(new Transaction(accountNumber, balance, true));
    }

    @Override
    public void log(double amount) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("       BIEN LAI GIAO DICH LOAN");
        System.out.println("NGAY G/D:          " + getDateTime());
        System.out.println("ATM ID:          DIGITAL-BANK-ATM 2022");
        System.out.printf("SO TK:                             %s\n", getAccountNumber());
        System.out.printf("SO TIEN:                      %,.0fđ\n", amount);
        System.out.printf("SO DU:                        %,.0fđ\n", getBalance());
        System.out.printf("PHI + VAT:                    %,.0fđ\n", getFee(amount));
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
        if (amount > LOAN_ACCOUNT_MAX_BALANCE) {
            return false;
        }
        if (getBalance() - getFee(amount) - amount < 50_000) {
            return false;
        }
        return true;
    }

    @Override
    public double getFee(double amount) {
        double fee = isPremium() ? LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE * amount : LOAN_ACCOUNT_WITHDRAW_FEE * amount;
        return fee;
    }

    @Override
    public String getAccountType() {
        return "LOAN";
    }
}
