package vn.funix.fx16513.java.asm02.models;

import java.util.Scanner;

public class Driver {
    public static final int CHOICE_ADD_CUSTOMER = 1;
    public static final int CHOICE_ADD_ACCOUNT_CUSTOMER = 2;
    public static final int CHOICE_SHOW_ACCOUNT_CUSTOMER = 3;
    public static final int CHOICE_FIND_CUSTOMER_FROM_ID = 4;
    public static final int CHOICE_FIND_CUSTOMER_FROM_NAME = 5;
    public static final int CHOICE_CLOSE_APP = 0;
    public static final String AUTHOR = "PHAN CONG HUY";
    public static final String VERSION = "FX16513";
    public static final double MIN_ACCOUNT_BALANCE = 50000;
    private Scanner sc;
    private String version;
    private Bank bank;
    private int selection;

    public Driver(Bank bank) {
        this.bank = bank;
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public void printMenu(String AUTHOR, String VERSION) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| NGAN HANG SO | " + AUTHOR + "@" + VERSION + "           |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. Them khach hang                             |");
        System.out.println("| 2. Them tai khoan cho khach hang               |");
        System.out.println("| 3. Hien thi tai khoan khach hang               |");
        System.out.println("| 4. Tim theo CCCD                               |");
        System.out.println("| 5. Tim theo ten khach hang                     |");
        System.out.println("| 0. Thoat                                       |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("Chuc nang: ");
    }

    public static boolean isValidNumericString(String s, int len) {
        boolean result = true;
        if (s.length() != len) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isValidCccd(String cccd) {
        return isValidNumericString(cccd, 12);
    }

    public static boolean isValidAccountNumber(String accountNumber) {
        return isValidNumericString(accountNumber, 6);
    }


    private void runAddCustomer() {
        // Nhap ten customer
        System.out.println("Nhap ten khach hang: ");
        String customerName = sc.next();

        // kiem tra dieu kien CCCD
        String cccd;
        boolean kiemtraCccd;
        do {
            System.out.println("Nhap so CCCD:");
            cccd = sc.next();
            kiemtraCccd = isValidCccd(cccd);
            // Neu ma CCCD khong hop le:
            if (!kiemtraCccd) {
                System.out.println("So CCCD khong hop le. Vui long nhap lai.");
            }
        } while (!kiemtraCccd);

        Customer customer = new Customer(customerName, cccd);
        bank.addCustomer(customer);
    }

    private void runAddAccountForCustomer() {
        String cccd;
        boolean isValidId;
        boolean isCustomerExisted;
        boolean isAccountNumberValid;
        String accountNumber;
        double balance;
        do {
            System.out.println("Nhap CCCD khach hang: ");
            cccd = sc.next();
            isValidId = isValidCccd(cccd);
            if (!isValidId) {
                System.out.println("So CCCD khong hop le. Vui long nhap lai.");
            }
            isCustomerExisted = bank.isCustomerExisted(cccd);
            if (!isCustomerExisted) {
                System.out.println("Khach hang khong ton tai. Vui long nhap lai.");
            }
        } while (!isValidId || !isCustomerExisted);

        do {
            System.out.println("Nhap ma STK gom 6 chu so:");
            accountNumber = sc.next();
            isAccountNumberValid = isValidAccountNumber(accountNumber);
            if (!isAccountNumberValid) {
                System.out.println("Ma STK chi duoc bao gom cac chu so. Vui long nhap lai.");
            }
        } while (!isAccountNumberValid);

        do {
            System.out.println("Nhap so du:");
            balance = sc.nextDouble();
            if (balance < MIN_ACCOUNT_BALANCE) {
                System.out.println("So du khong duoc nho hon 50000VND. Vui long nhap lai.");
            }
        } while (balance < MIN_ACCOUNT_BALANCE);

        Account newAccount = new Account(accountNumber, balance);
        bank.addAccount(cccd, newAccount);
    }
    private void runShowAccountCustomer() {
        for (int i = 0; i < bank.getCustomers().size(); i++) {
            bank.getCustomers().get(i).displayInformation();
        }
    }
    private void runFindCustomerFromId() {
        System.out.println("Tim kiem khach hang theo CCCD.");
        String cccd;
        boolean isValidId;
        boolean isCustomerExisted;
        do {
            System.out.println("Nhap CCCD khach hang: ");
            cccd = sc.next();
            isValidId = isValidCccd(cccd);
            if (!isValidId) {
                System.out.println("So CCCD khong hop le. Vui long nhap lai.");
            }
            isCustomerExisted = bank.isCustomerExisted(cccd);
            if (!isCustomerExisted) {
                System.out.println("Khach hang khong ton tai. Vui long nhap lai.");
            }
        } while (!isValidId || !isCustomerExisted);

        Customer customer = bank.searchCustomer(cccd);
        customer.displayInformation();
    }
    private void runFindCustomerFromName() {
        String customerName;
        String customerNameLowerCase;
            System.out.println("Nhap ten khach hang: ");
            customerName = sc.next();
            customerNameLowerCase = customerName.toLowerCase();
            for (int i = 0; i < bank.getCustomers().size(); i++) {
                if (bank.getCustomers().get(i).getName().toLowerCase().contains(customerNameLowerCase)) {
                    bank.getCustomers().get(i).displayInformation();
                }
            }
    }

    public void run() {
        do {
            printMenu(AUTHOR, VERSION);
            this.selection = sc.nextInt();
            if (selection == CHOICE_ADD_CUSTOMER) {
                runAddCustomer();
            } else if (selection == CHOICE_ADD_ACCOUNT_CUSTOMER) {
                runAddAccountForCustomer();
            } else if (selection == CHOICE_SHOW_ACCOUNT_CUSTOMER) {
                runShowAccountCustomer();
            } else if (selection == CHOICE_FIND_CUSTOMER_FROM_ID) {
                runFindCustomerFromId();
            } else if (selection == CHOICE_FIND_CUSTOMER_FROM_NAME) {
                runFindCustomerFromName();
            }
        } while (selection != CHOICE_CLOSE_APP);
    }
}
