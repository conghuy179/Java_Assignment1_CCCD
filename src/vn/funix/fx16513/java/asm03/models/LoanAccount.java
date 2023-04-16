package vn.funix.fx16513.java.asm03.models;

import vn.funix.fx16513.java.asm02.models.Account;

/**
 * Class quan ly tai khoan cua khach hang
 * ke thua class Account
 */
public class LoanAccount extends Account {
    /**
     * 3 hang so:
     * LOAN_ACCOUNT_WITHDRAW_FEE dinh nghia phi rut tien cho tai khoan thuong
     * LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE dinh nghia phi rut tien cho tai khoan premium
     * LOAN_ACCOUNT_MAX_BALANCE dinh nghia han muc toi da cho tai khoan Loan
     */
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
        addNewTransaction(new Transaction(accountNumber, balance, true, false));
    }

    /**
     * TIEU CHI 5:
     * Ham Log de in bien lai giao dich Loan
     * @param amount: so tien moi khi rut
     */
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
    /**
     * TIEU CHI 6:
     * Ham withdraw duoc override theo yeu cau cua Loan Account
     * @param amount: so tien rut ra
     * @return: True neu rut tien thanh cong, false neu that bai.
     */
    @Override
    public boolean withdraw(double amount) {
        boolean status = false;
        if (isAccepted(amount)) {
            setBalance(getBalance() - getFee(amount) - amount);
            status = true;
        } else {
            status = false;
        }
        addNewTransaction(new Transaction(getAccountNumber(), amount, status, true));
        return status;
    }
    /**
     * Ham isAccepted duoc override theo yeu cau cua Loan Account
     * @param amount: so tien muon rut
     * @return: True neu thoa man dieu kien rut tien, false neu that bai
     */
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

    /**
     * Ham tinh phi rut tien
     * @param amount So tien muon rut
     * @return Phi rut tien dua theo 2 loai tai khoan
     */
    @Override
    public double getFee(double amount) {
        double fee = isPremium()
                ? LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE * amount
                : LOAN_ACCOUNT_WITHDRAW_FEE * amount;
        return fee;
    }
    /**
     * Ham xac dinh loai tai khoan duoc override
     * @return tra ve LOAN
     */
    @Override
    public String getAccountType() {
        return "LOAN";
    }
}
