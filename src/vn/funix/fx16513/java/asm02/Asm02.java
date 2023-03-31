package vn.funix.fx16513.java.asm02;

import vn.funix.fx16513.java.asm02.models.Bank;
import vn.funix.fx16513.java.asm02.models.Driver;

public class Asm02 {
    public static final String AUTHOR = "PHAN CONG HUY";
    public static final String VERSION = "FX16513";
    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        Driver driver = new Driver(bank);
        driver.run();
    }
}
