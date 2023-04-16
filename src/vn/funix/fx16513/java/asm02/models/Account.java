package vn.funix.fx16513.java.asm02.models;

import vn.funix.fx16513.java.asm03.models.Transaction;
import vn.funix.fx16513.java.asm03.util.ReportService;
import vn.funix.fx16513.java.asm03.util.Withdraw;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Class Account chua thong tin quan ly tai khoan cua khach hang.
 * Field: accountNumber: So tai khoan khach hang, 6 chu so.
 * balance:       So du tai khoan.
 */
public class Account implements Withdraw, ReportService {
    private String accountNumber;
    private double balance;
    private List<Transaction> transactionList;

    /**
     * Constructor cua Account:
     *
     * @param accountNumber: So tai khoan khach hang.
     * @param balance:       So du tai khoan.
     */
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    /**
     * Ham lay thong tin so du tai khoan
     *
     * @return: So du tai khoan.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Ham set so du tai khoan.
     *
     * @param balance: so du tai khoan.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Ham lay thong tin so tai khoan khach hang.
     *
     * @return: So tai khoan khach hang.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Ham set so tai khoan khach hang.
     *
     * @param accountNumber: So tai khoan khach hang.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * TIEU CHI 3:
     * Ham kiem tra tai khoan co phai premium hay khong
     *
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

    public String getAccountType() {
        return "";
    }

    public double getFee(double amount) {
        return 0;
    }

    public static String getDateTime() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }

    public List<Transaction> getTransactionHistory() {
        return transactionList;
    }

    public void addNewTransaction(Transaction newTransaction) {
        transactionList.add(newTransaction);
    }


    @Override
    public void log(double amount) {

    }

    @Override
    public boolean withdraw(double amount) {
        boolean status = false;
        if (isAccepted(amount)) {
            balance = getBalance() - amount;
            status = true;
        } else {
            status = false;
        }
        addNewTransaction(new Transaction(accountNumber, amount, status, true));
        return status;
    }

    @Override
    public boolean isAccepted(double amount) {
        return false;
    }
}

