package vn.funix.fx16513.java.asm02.models;


import vn.funix.fx16513.java.asm02.util.Validations;

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
        setCustomerID(customerID);
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
        // if customer id is valid => allow it to set
        // otherwise, throw an illegal argument exception
        if (Validations.isValidCccd(customerID)) {
            this.customerID = customerID;
        } else {
            throw new IllegalArgumentException("Invalid customerID: " + customerID);
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
}
