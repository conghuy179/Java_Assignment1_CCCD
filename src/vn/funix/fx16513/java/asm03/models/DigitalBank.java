package vn.funix.fx16513.java.asm03.models;

import vn.funix.fx16513.java.asm02.models.Bank;
import vn.funix.fx16513.java.asm02.models.Customer;

public class DigitalBank extends Bank {
    public DigitalBank() {
    }

    public void withdraw(String customerId, String accountNumber, double amount) {
        if (!isCustomerExisted(customerId)) {
            System.out.println("Khong tim thay khach hang.");
        } else {
            Customer customer = searchCustomer(customerId);
            customer.withdraw(accountNumber, amount);
        }
    }
}
