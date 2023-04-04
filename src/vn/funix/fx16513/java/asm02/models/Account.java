package vn.funix.fx16513.java.asm02.models;

/**
 * Class Account chua thong tin quan ly tai khoan cua khach hang.
 * Field: accountNumber: So tai khoan khach hang, 6 chu so.
 *        balance:       So du tai khoan.
 *
 */
public class Account {
    private String accountNumber;
    private double balance;

    /**
     * Constructor cua Account:
     * @param accountNumber: So tai khoan khach hang.
     * @param balance: So du tai khoan.
     */
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Ham lay thong tin so du tai khoan
     * @return: So du tai khoan.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Ham set so du tai khoan.
     * @param balance: so du tai khoan.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Ham lay thong tin so tai khoan khach hang.
     * @return: So tai khoan khach hang.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Ham set so tai khoan khach hang.
     * @param accountNumber: So tai khoan khach hang.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * TIEU CHI 3:
     * Ham kiem tra tai khoan co phai premium hay khong
     * @return: Neu so du tai khoan tren 10_000_000 VND, return true. Neu khong, return false.
     */
    public boolean isPremium() {
        return balance >= 10_000_000;
    }

    /**
     * Ham xuat thong tin tai khoan gom ma tai khoan va so du.
     */
    public void toStringAccount() {
        System.out.println(accountNumber + "|                " + balance);
    }
}
