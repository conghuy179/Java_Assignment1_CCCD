package vn.funix.fx16513.java.asm03;


import vn.funix.fx16513.java.asm03.models.DigitalBank;

import java.util.Scanner;

/**
 * Class Asm03 chua ham main de khoi chay chuc nang
 */
public class Asm03 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DigitalBank activeBank = new DigitalBank();

    /**
     * TIEU CHI 1:
     * Ham Main dieu khien luong chinh cua chuong trinh
     * @param args
     */
    public static void main(String[] args) {
        Driver3 driver = new Driver3(activeBank, scanner);
        driver.run();
    }

}
