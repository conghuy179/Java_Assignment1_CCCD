package vn.funix.fx16513.java.asm02.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank {
    private String id;
    private List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
        this.id = String.valueOf(UUID.randomUUID());

    }

    public void addCustomer(Customer newCustomer) {
        if (!isCustomerExisted(newCustomer.getCustomerID())) {
            customers.add(newCustomer);
        }
    }

    public boolean isCustomerExisted(String customerId) {
        boolean answer = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customerId.equals(customers.get(i).getCustomerID())) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
    public Customer searchCustomer(String customerId) {
        for (int i = 0; i < customers.size(); i++) {
            if (customerId.equals(customers.get(i).getCustomerID())) {
                return customers.get(i);
            }
        }
        return null;
    }
    public void addAccount(String customerId, Account account) {
        Customer customer = searchCustomer(customerId);
        if (customer != null) {
            customer.addAccount(account);
        } else {
            System.out.println("Khong tim thay khach hang.");
        }
    }

}
