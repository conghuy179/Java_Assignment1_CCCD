package vn.funix.fx16513.java.asm03.models;

import vn.funix.fx16513.java.asm02.models.Account;

/**
 * Class quan ly tai khoan tiet kiem cua khach hang
 * ke thua class Account
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
        addNewTransaction(new Transaction(accountNumber, balance, true, false));
    }

    /**
     * TIEU CHI 5:
     * Ham Log de in bien lai giao dich Savings
     * @param amount: so tien moi khi rut
     */
    @Override
    public void log(double amount) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("       BIEN LAI GIAO DICH SAVINGS");
        System.out.println("NGAY G/D:          " + getDateTime());
        System.out.println("ATM ID:          DIGITAL-BANK-ATM 2022");
        System.out.printf("SO TK:                             %s\n", getAccountNumber());
        System.out.printf("SO TIEN:                       %,.0fđ\n", amount);
        System.out.printf("SO DU:                         %,.0fđ\n",getBalance());
        System.out.printf("PHI + VAT:                     %,.0fđ\n",getFee(amount));
        System.out.println("+----------+-------------------------+----------+");
    }

    /**
     * TIEU CHI 6:
     * Ham withdraw duoc override theo yeu cau cua Saving Account
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
     * Ham isAccepted duoc override theo yeu cau cua Saving Account
     * @param amount: so tien muon rut
     * @return: True neu thoa man dieu kien rut tien, false neu that bai
     */
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

    /**
     * Ham xac dinh loai tai khoan duoc override
     * @return tra ve SAVINGS
     */
    @Override
    public String getAccountType() {
        return "SAVINGS";
    }

}
