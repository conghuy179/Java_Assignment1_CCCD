package vn.funix.fx16513.java.asm03.models;

import vn.funix.fx16513.java.asm02.models.Account;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Transaction dinh nghia cho class quan ly giao dich
 */
public class Transaction {
    private String id;
    private String accountNumber;
    private double amount;
    private String time;
    private boolean status;
    private DigitalCustomer digitalCustomer;

    public Transaction(String accountNumber, double amount, boolean status) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.status = status;
        this.id = String.valueOf(UUID.randomUUID());
        this.time = getDateTime();
    }
    public String getTransactionAccountNumber() {
        return accountNumber;
    }
    public double getTransactionAmount() {
        return amount;
    }
    public boolean getTransactionStatus() {
        return status;
    }
    public String getTransactionTime() {
        return time;
    }

    public Account getCustomerByAccount(String accountNumber) {
        for (int i = 0; i < digitalCustomer.getAccounts().size(); i++) {
            if (accountNumber.equals(digitalCustomer.getAccounts().get(i).getAccountNumber())) {
                return digitalCustomer.getAccounts().get(i);
            }
        }
        return null;
    }

    public static String getDateTime() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }
}
