package vn.funix.fx16513.java.asm02.util;

public class Validations {
    /**
     * Ham kiem tra day so hop le (su dung cho ca CCCD va ma so tai khoan).
     * @param s: day so can kiem tra.
     * @param len: Do dai quy dinh.
     * @return Neu ko thoa man, return false. Neu thoa man, return true.
     */
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
    /**
     * Ham kiem tra CCCD co hop le hay khong bang cach su dung ham isValidNumericString voi bien len: 12.
     * @param cccd: ma CCCD can kiem tra.
     * @return Neu ko thoa man, return false. Neu thoa man, return true.
     */
    public static boolean isValidCccd(String cccd) {
        return isValidNumericString(cccd, 12);
    }

    /**
     * Ham kiem tra ma so tai khoan co hop le hay khong bang cach su dung ham isValidNumericString voi bien len: 6.
     * @param accountNumber: Ma so tai khoan can kiem tra.
     * @return Neu ko thoa man, return false. Neu thoa man, return true.
     */
    public static boolean isValidAccountNumber(String accountNumber) {
        return isValidNumericString(accountNumber, 6);
    }
}
