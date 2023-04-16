package vn.funix.fx16513.java.asm03.models;

import vn.funix.fx16513.java.asm02.models.Bank;
import vn.funix.fx16513.java.asm02.models.Customer;

/**
 * TIEU CHI 2:
 * Class DigitalBank: Ke thua class Bank
 */
public class DigitalBank extends Bank {
    public DigitalBank() {
    }

    /**
     * Ham withdraw cho phep khach hang rut tien theo tai khoan
     * @param customerId: CCCD khach hang
     * @param accountNumber: Ma TK khach hang
     * @param amount: So tien muon rut
     */
    public void withdraw(String customerId, String accountNumber, double amount) {
        if (!isCustomerExisted(customerId)) {
            System.out.println("Khong tim thay khach hang.");
        } else {
            Customer customer = searchCustomer(customerId);
            customer.withdraw(accountNumber, amount);
        }
    }
}
