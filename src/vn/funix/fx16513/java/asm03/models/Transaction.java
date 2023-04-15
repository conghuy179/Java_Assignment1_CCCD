package vn.funix.fx16513.java.asm03.models;

import vn.funix.fx16513.java.asm02.models.Customer;

import java.util.UUID;

/**
 * Transaction dinh nghia cho class quan ly giao dich
 */
public class Transaction {
        private String id;
        private String accountNumber;
        private double amount;
        private String time;
        private boolean status;
public Transaction() {
        this.id = String.valueOf(UUID.randomUUID());
}
public Customer getCustomerbyAccount(String accountNumber) {

}
}
