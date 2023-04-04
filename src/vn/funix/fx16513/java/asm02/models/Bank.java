package vn.funix.fx16513.java.asm02.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Class Bank chua thong tin ngan hang, bao gom:
 *  ID: Ma dinh dang cua ngan hang.
 *  List<Customer>customers: Danh sach khach hang trong ngan hang.
 *
 */
public class Bank {
    private String id;
    private List<Customer> customers;

    /**
     * Constructor Bank bao gom:
     * List khach hang cua ngan hang.
     * ID duoc khoi tao gia tri ngau nhien.
     */
    public Bank() {
        this.customers = new ArrayList<>();
        this.id = String.valueOf(UUID.randomUUID());

    }

    /**
     * Ham them khach hang moi cho ngan hang.
     * @param newCustomer: Khach hang moi duoc them vao voi dieu kien CCCD chua tung ton tai.
     */
    public void addCustomer(Customer newCustomer) {
        if (!isCustomerExisted(newCustomer.getCustomerID())) {
            customers.add(newCustomer);
        }
    }

    /**
     * Ham kiem tra su ton tai cua khach hang trong ngan hang.
     * @param customerId: CCCD khach hang.
     * @return Neu ton tai, tra ve true. Neu khong ton tai, tra ve false.
     */
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

    /**
     * Ham lay danh sach tat ca khach hang cua ngan hang.
     * @return Tra ve danh sach khach hang.
     */
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * TIEU CHI 4:
     * Ham tim khach hang.
     * @param customerId CCCD cua khach hang. Duoc su dung de tim khach hang
     *                   trong ngan hang.
     * @return Neu tim thay CCCD, return khach hang. Neu khong tim thay, tra
     *                  ve null.
     */
    public Customer searchCustomer(String customerId) {
        for (int i = 0; i < customers.size(); i++) {
            if (customerId.equals(customers.get(i).getCustomerID())) {
                return customers.get(i);
            }
        }
        return null;
    }

    /**
     * TIEU CHI 3 NANG CAO:
     * Ham them account cho khach hang.
     * @param customerId: CCCD cua khach hang. Duoc su dung de tim kiem khach hang.
     * @param account: Them account neu tim thay khach hang.
     */
    public void addAccount(String customerId, Account account) {
        Customer customer = searchCustomer(customerId);
        if (customer != null) {
            customer.addAccount(account);
        } else {
            System.out.println("Khong tim thay khach hang.");
        }
    }

}
