package vn.funix.fx16513.java.asm02.models;

/**
 * Class User: Chua thong tin nguoi dung cua he thong.
 * Field: name: ten nguoi dung.
 *        customerId: Ma CCCD, 12 so.
 *
 */
public class User {
    private String name;
    private String customerID;

    /**
     * Constructor User:
     * @param name: ten nguoi dung.
     * @param customerID: CCCD.
     */
    public User(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
    }

    /**
     * Ham lay thong tin CCCD.
     * @return: CCCD.
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * TIEU CHI 1 NANG CAO:
     * Ham set CCCD (chi cap nhat khi CCCD hop le).
     * @param customerID: CCCD.
     */
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

    /**
     * Ham lay ten khach hang.
     * @return: ten khach hang.
     */
    public String getName() {
       return name;
    }

    /**
     * Ham set ten khach hang.
     * @param name: Ten khach hang.
     */
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
