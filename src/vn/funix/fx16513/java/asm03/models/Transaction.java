package vn.funix.fx16513.java.asm03.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * TIEU CHI 1 NANG CAO:
 * Transaction dinh nghia cho class quan ly giao dich
 */
public class Transaction {
    private String id;
    private String accountNumber;
    private double amount;
    private String time;
    private boolean status;
    private boolean isWithdrawal;

    /**
     * Construction Transaction:
     * @param accountNumber: Ma TK khach hang
     * @param amount: so tien muon rut
     * @param status: Trang thai cua giao dich: Co thanh cong hay khong
     * @param isWithdrawal: La rut tien hay la tao tai khoan
     */
    public Transaction(String accountNumber, double amount, boolean status, boolean isWithdrawal) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.status = status;
        this.id = String.valueOf(UUID.randomUUID());
        this.time = getDateTime();
        this.isWithdrawal = isWithdrawal;
    }

    /**
     * Ham lay ma TK
     * @return: Ma TK khach hang
     */
    public String getTransactionAccountNumber() {
        return accountNumber;
    }

    /**
     * Ham lay so tien muon rut
     * @return: So tien muon rut
     */
    public double getTransactionAmount() {
        return amount;
    }

    /**
     * Ham lay trang thai cua giao dich
     * @return boolean trang thai giao dich
     */
    public boolean getTransactionStatus() {
        return status;
    }

    /**
     * Ham lay ket qua co phai rut tien hay khong?
     * @return Ket qua boolean
     */
    public boolean getIsWithdrawal() {
        return this.isWithdrawal;
    }

    /**
     * Ham lay thoi gian giao dich
     * @return: String thoi gian
     */
    public String getTransactionTime() {
        return time;
    }

    /**
     * Ham lay thoi gian
     * @return String thoi gian
     */
    public static String getDateTime() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }
}
