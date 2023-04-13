package vn.funix.fx16513.java.asm03.util;


import vn.funix.fx16513.java.asm03.models.DigitalBank;

import java.util.Scanner;

public class Asm03 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DigitalBank activeBank = new DigitalBank();
    public static void main(String[] args) {
        Driver3 driver = new Driver3(activeBank, scanner);
        driver.run();
    }

}
