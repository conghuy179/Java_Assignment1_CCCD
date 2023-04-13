package vn.funix.fx16513.java.asm03.util;

import vn.funix.fx16513.java.asm02.models.Account;
import vn.funix.fx16513.java.asm02.models.Customer;
import vn.funix.fx16513.java.asm02.util.Validations;
import vn.funix.fx16513.java.asm03.models.DigitalBank;
import vn.funix.fx16513.java.asm03.models.DigitalCustomer;
import vn.funix.fx16513.java.asm03.models.LoanAccount;
import vn.funix.fx16513.java.asm03.models.SavingAccount;

import java.util.Scanner;

public class Driver3 {
    public static final int CHOICE_SHOW_INFO_CUSTOMER = 1;
    public static final int CHOICE_ADD_SAVING_ACCOUNT = 2;
    public static final int CHOICE_ADD_LOAN_ACCOUNT = 3;
    public static final int CHOICE_WITHDRAW = 4;
    public static final int CHOICE_TRANSACTION_HISTORY = 5;
    public static final int CHOICE_EXIT = 0;
    private static final int EXIT_ERROR_CODE = -1;

    private static final String CUSTOMER_ID = "001095013737";
    private static final String CUSTOMER_NAME = "FUNIX";
    private static final String AUTHOR = "PHAN CONG HUY";
    private static final String VERSION = "FX16513";
    private int selection;
    private DigitalBank digitalBank;
    private Scanner scanner;

    public Driver3(DigitalBank digitalBank, Scanner scanner) {
        this.digitalBank = digitalBank;
        this.scanner = scanner;
    }

    public void run() {
        digitalBank.addCustomer(new DigitalCustomer(CUSTOMER_NAME, CUSTOMER_ID));
        do {
            printMenu(AUTHOR, VERSION);
            selection = scanner.nextInt();
            if (selection == CHOICE_SHOW_INFO_CUSTOMER) {
                runShowInfoCustomer();
            } else if (selection == CHOICE_ADD_SAVING_ACCOUNT) {
                runAddAccount(CHOICE_ADD_SAVING_ACCOUNT);
            } else if (selection == CHOICE_ADD_LOAN_ACCOUNT) {
                runAddAccount(CHOICE_ADD_LOAN_ACCOUNT);
            } else if (selection == CHOICE_WITHDRAW) {
                runWithdraw();
            }
        } while (selection != CHOICE_EXIT);
    }



    /**
     * Ham in Menu.
     *
     * @param author  ten tac gia, o day la Phan Cong Huy.
     * @param version Ten phien ban, o day la ma SV: FX16513.
     */
    public void printMenu(String author, String version) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| NGAN HANG SO | " + author + "@" + version + "          |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. Thong tin khach hang                       |");
        System.out.println("| 2. Them tai khoan Savings                     |");
        System.out.println("| 3. Them tai khoan Loan                        |");
        System.out.println("| 4. Rut tien                                   |");
        System.out.println("| 5. Lich su giao dich                          |");
        System.out.println("| 0. Thoat                                      |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("Chuc nang: ");
    }

    public void runShowInfoCustomer() {
        Customer customer = digitalBank.searchCustomer(CUSTOMER_ID);
        if (customer != null) {
            customer.displayInformation();
        }
    }

    public void runAddAccount(int choiceAccountType) {
        String cccd;
        boolean isValidId;
        boolean isCustomerExisted;
        boolean isAccountNumberValid;
        String accountNumber;
        double balance;

        do {
            System.out.println("Nhap CCCD khach hang can them tai khoan: ");
            cccd = scanner.next();
            isValidId = Validations.isValidCccd(cccd);
            if (!isValidId) {
                System.out.println("So CCCD khong hop le. Vui long nhap lai.");
            }
            isCustomerExisted = digitalBank.isCustomerExisted(cccd);
            if (!isCustomerExisted) {
                System.out.println("Khach hang khong ton tai. Vui long nhap lai.");
            }
        } while (!isValidId || !isCustomerExisted);

        do {
            System.out.println("Nhap ma STK gom 6 chu so:");
            accountNumber = scanner.next();
            isAccountNumberValid = Validations.isValidAccountNumber(accountNumber);
            if (!isAccountNumberValid) {
                System.out.println("Ma STK chi duoc bao gom cac chu so. Vui long nhap lai.");
            }
        } while (!isAccountNumberValid);

        do {
            System.out.println("Nhap so du:");
            balance = scanner.nextDouble();
            if (balance < 0) {
                System.out.println("So du khong duoc nho hon 0 VND. Vui long nhap lai.");
            }
        } while (balance < 0);

        Account newAccount;
        if (choiceAccountType == CHOICE_ADD_SAVING_ACCOUNT) {
            newAccount = new SavingAccount(accountNumber, balance);
            digitalBank.addAccount(cccd, newAccount);
        } else if (choiceAccountType == CHOICE_ADD_LOAN_ACCOUNT) {
            newAccount = new LoanAccount(accountNumber, balance);
            digitalBank.addAccount(cccd, newAccount);
        }
    }
    private void runWithdraw() {
        String accountNumber;
        double amount;
        boolean isAccountNumberValid;

        do {
            System.out.println("Nhap ma STK gom 6 chu so:");
            accountNumber = scanner.next();
            isAccountNumberValid = Validations.isValidAccountNumber(accountNumber);
            if (!isAccountNumberValid) {
                System.out.println("Ma STK chi duoc bao gom cac chu so. Vui long nhap lai.");
            }
        } while (!isAccountNumberValid);

        do {
            System.out.println("Nhap so tien muon rut: ");
            amount = scanner.nextDouble();
            if (amount < 0) {
                System.out.println("So tien khong duoc nho hon 0 VND. Vui long nhap lai.");
            }
        } while (amount < 0);

        digitalBank.withdraw(CUSTOMER_ID, accountNumber, amount);
    }


}
