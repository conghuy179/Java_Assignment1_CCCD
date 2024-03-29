package vn.funix.fx16513.java.asm02;

import vn.funix.fx16513.java.asm02.models.Bank;

public class Asm02 {
    public static final String AUTHOR = "PHAN CONG HUY";
    public static final String VERSION = "FX16513";
    private static final Bank bank = new Bank();

    /**
     * TIEU CHI 1:
     * Ham main:  Dieu khien luong chinh cua chuong trinh:
     * Doi tuong bank.
     * @param args
     */
    public static void main(String[] args) {
        Driver driver = new Driver(bank);
        driver.run();
    }
}
