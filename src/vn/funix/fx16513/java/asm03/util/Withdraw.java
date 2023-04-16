package vn.funix.fx16513.java.asm03.util;

/**
 * Interface cho nghiep vu rut tien
 */
public interface Withdraw {
    /**
     * Xu ly nghiep vu rut tien
     * @param amount: so tien rut ra
     * @return: True khi rut duoc tien, false khi khong thuc hien duoc
     * nghiep vu rut tien
     */
    boolean withdraw(double amount);

    /**
     * Xac dinh co thoa man dieu kien rut tien hay khong
     * @param amount: so tien muon rut
     * @return: True khi thoa man dieu kien, false khi ko thoa man
     */
    boolean isAccepted(double amount);
}
