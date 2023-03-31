package vn.funix.fx16513.java.asm02.models;

public class User {
    private String name;
    private String customerID;
    public User(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
    }


    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
            boolean kiemtraCccd;
            do {
                kiemtraCccd = isValidCccd(customerID);
                // Neu ma CCCD khong hop le:
                if (!kiemtraCccd) {
                    System.out.println("So CCCD khong hop le. Vui long nhap lai.");
                    // throws new Exception("So CCCD khong hop le. Vui long nhap lai.");
                }
            } while (!kiemtraCccd);
            if (kiemtraCccd) {
                this.customerID = customerID;
            }
    }

    public String getName() {
       return name;
    }
    public void setName(String name) {
        this.name = name;
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

}
