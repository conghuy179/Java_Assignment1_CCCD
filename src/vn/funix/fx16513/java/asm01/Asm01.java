package vn.funix.fx16513.java.asm01;

import java.util.Scanner;
import java.util.Random;

public class Asm01 {
    /**
     * Check tinh hop le cua cccd: Du 12 phan tu + la 12 chu so
     *
     * @param cccd ma can cuoc cong dan
     * @return true if cccd hop le, nguoc lai thi return false
     */
    public static boolean isValidCccd(String cccd) {
        boolean result = true;
        if (cccd.length() != 12) {
            return false;
        }
        for (int i = 0; i < 12; i++) {
            if (!Character.isDigit(cccd.charAt(i))) {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Ham hien thi thong tin tinh thanh
     *
     * @param cccd Ma can cuoc cong dan
     * @return Noi sinh neu birthcode thuoc bang mo ta, neu ko thuoc bang thi return empty
     */
    public static String getBirthPlace(String cccd) {
        String birthPlace;
        String birthCode = cccd.substring(0, 3);
        switch (birthCode) {
            case "001":
                birthPlace = "Hanoi";
                break;
            case "002":
                birthPlace = "Ha Giang";
                break;
            case "004":
                birthPlace = "Cao Bang";
                break;
            case "006":
                birthPlace = "Bac Kan";
                break;
            case "008":
                birthPlace = "Tuyen Quang";
                break;
            case "010":
                birthPlace = "Lao Cai";
                break;
            case "011":
                birthPlace = "Dien Bien";
                break;
            case "012":
                birthPlace = "Lai Chau";
                break;
            case "014":
                birthPlace = "Son La";
                break;
            case "015":
                birthPlace = "Yen Bai";
                break;
            case "017":
                birthPlace = "Hoa Binh";
                break;
            case "019":
                birthPlace = "Thai Nguyen";
                break;
            case "020":
                birthPlace = "Lang Son";
                break;
            case "022":
                birthPlace = "Quang Ninh";
                break;
            case "024":
                birthPlace = "Bac Giang";
                break;
            case "025":
                birthPlace = "Phu Tho";
                break;
            case "026":
                birthPlace = "Vinh Phuc";
                break;
            case "027":
                birthPlace = "Bac Ninh";
                break;
            case "030":
                birthPlace = "Hai Duong";
                break;
            case "031":
                birthPlace = "Hai Phong";
                break;
            case "033":
                birthPlace = "Hung Yen";
                break;
            case "034":
                birthPlace = "Thai Binh";
                break;
            case "035":
                birthPlace = "Ha Nam";
                break;
            case "036":
                birthPlace = "Nam Dinh";
                break;
            case "037":
                birthPlace = "Ninh Binh";
                break;
            case "038":
                birthPlace = "Thanh Hoa";
                break;
            case "040":
                birthPlace = "Nghe An";
                break;
            case "042":
                birthPlace = "Ha Tinh";
                break;
            case "044":
                birthPlace = "Quang Binh";
                break;
            case "045":
                birthPlace = "Quang Tri";
                break;
            case "046":
                birthPlace = "Thua Thien Hue";
                break;
            case "048":
                birthPlace = "Da Nang";
                break;
            case "049":
                birthPlace = "Quang Nam";
                break;
            case "051":
                birthPlace = "Quang Ngai";
                break;
            case "052":
                birthPlace = "Binh Dinh";
                break;
            case "054":
                birthPlace = "Phu Yen";
                break;
            case "056":
                birthPlace = "Khanh Hoa";
                break;
            case "058":
                birthPlace = "Ninh Thuan";
                break;
            case "060":
                birthPlace = "Binh Thuan";
                break;
            case "062":
                birthPlace = "Kon Tum";
                break;
            case "064":
                birthPlace = "Gia Lai";
                break;
            case "066":
                birthPlace = "Dak Lak";
                break;
            case "067":
                birthPlace = "Dak Nong";
                break;
            case "068":
                birthPlace = "Lam Dong";
                break;
            case "070":
                birthPlace = "Binh Phuoc";
                break;
            case "072":
                birthPlace = "Tay Ninh";
                break;
            case "074":
                birthPlace = "Binh Duong";
                break;
            case "075":
                birthPlace = "Dong Nai";
                break;
            case "077":
                birthPlace = "Ba Ria - Vung Tau";
                break;
            case "079":
                birthPlace = "Ho Chi Minh";
                break;
            case "080":
                birthPlace = "Long An";
                break;
            case "082":
                birthPlace = "Tien Giang";
                break;
            case "083":
                birthPlace = "Ben Tre";
                break;
            case "084":
                birthPlace = "Tra Vinh";
                break;
            case "086":
                birthPlace = "Vinh Long";
                break;
            case "087":
                birthPlace = "Dong Thap";
                break;
            case "089":
                birthPlace = "An Giang";
                break;
            case "091":
                birthPlace = "Kien Giang";
                break;
            case "092":
                birthPlace = "Can Tho";
                break;
            case "093":
                birthPlace = "Hau Giang";
                break;
            case "094":
                birthPlace = "Soc Trang";
                break;
            case "095":
                birthPlace = "Bac Lieu";
                break;
            case "096":
                birthPlace = "Ca Mau";
                break;
            default:
                birthPlace = "";
                break;
        }
        return birthPlace;
    }

    /**
     * Ham hien thi thong tin gioi tinh
     *
     * @param ageCode Ma tuoi (chu so thu 4 trong cccd)
     * @return Gioi tinh nam hoac nu neu ageCode thuoc bang mo ta, neu ko thuoc bang thi return empty
     */
    public static String getGender(int ageCode) {
        String gender;
        switch (ageCode) {
            case 0: case 2: case 4: case 6: case 8:
                gender = "nam";
                break;
            case 1: case 3: case 5: case 7: case 9:
                gender = "nu";
                break;
            default:
                gender = "";
                break;
        }
        return gender;
    }

    /**
     * Ham hien thi nam sinh
     * @param ageCode Ma tuoi (chu so thu 4 trong cccd)
     * @param age Ma nam sinh (chu so thu 5 va 6 trong cccd)
     * @return Nam sinh (century + age)
     */

    public static int getYearOfBirth(int ageCode, int age) {
        int century;
        switch (ageCode) {
            case 0: case 1:
                century = 1900;
                break;
            case 2: case 3:
                century = 2000;
                break;
            case 4: case 5:
                century = 2100;
                break;
            case 6: case 7:
                century = 2200;
                break;
            case 8: case 9:
                century = 2300;
                break;
            default:
                century = 0;
                break;
        }
        return century + age;
    }

    /**
     * Hang so chua cac chu so de ho tro tao ma bao mat nang cao
     */
    public static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
    /**
     * Hang so chua ten author
     */
    public static final String AUTHOR = "FX16513";
    /**
     * Hang so chua version
     */
    public static final String VERSION = "v1.0.0";
    /**
     * Ham sinh ma bao mat co ban
     *
     * @return ma bao mat co ban
     */
    public static String generateBasicAuthCode() {
        Random random = new Random();
        int authCode = 100 + random.nextInt(899);
        return String.valueOf(authCode);
    }

    /**
     * Ham sinh ma bao mat nang cao
     *
     * @return Ma bao mat nang cao
     */
    public static String generateAdvancedAuthCode() {
        Random random = new Random();

        char[] randomChars = new char[6];
        for (int i = 0; i < 6; i++) {
            randomChars[i] = ALPHA_NUMERIC_STRING.charAt(random.nextInt(ALPHA_NUMERIC_STRING.length()));
        }

        return String.valueOf(randomChars);
    }

    /**
     * Ham hien thi menu chuong trinh chinh
     */
    public static void menu(String AUTHOR, String VERSION) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| NGAN HANG SO | " + AUTHOR + "@" + VERSION + "                 |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. NHAP CCCD                                  |");
        System.out.println("| 0. Thoat                                      |");
        System.out.println("+----------+-------------------------+----------+");
    }

    /**
     * Ham hien thi menu chuong trinh 2 (Menu sau khi nhap cccd)
     */
    public static void menu2() {
        System.out.println("| 1. Kiem tra noi sinh");
        System.out.println("| 2. Kiem tra tuoi, gioi tinh");
        System.out.println("| 3. Kiem tra so ngau nhien");
        System.out.println("| 0. Thoat");
    }

    /**
     * Ham hien thi menu khi nhap ma xac thuc:
     */
    public static void menuForAuthCode() {
        System.out.println("| 1. NHAP MA XAC THUC CO BAN                                  |");
        System.out.println("| 2. NHAP MA XAC THUC NANG CAO                                |");
    }
    /**
     * Ham main: Dieu khien luong chinh cua chuong trinh
     *
     * @param args
     */
    public static void main(String[] args) {
        menu(AUTHOR, VERSION);
        Scanner sc = new Scanner(System.in);
        //Khai bao lua chon, cccd, noi sinh, gioi tinh va nam sinh
        int selection;
        String cccd;

        String birthPlace;
        String gender;
        int yearOfBirth;
        /*
        neu nhap 1:
        Hien random number de user nhap
            Nhap sai: hien thong bao nhap sai + yeu cau nhap lai
            Nhap dung: duoc nhap cccd
         */

        do {
            selection = sc.nextInt();
            if (selection == 1) {
                System.out.println("Chuc nang: " + selection);

                // mo ra menu cho user lua chon kieu xac thuc
                // Neu chon 1: Nhap ma xac thuc co ban
                // Neu chon 2: Nhap ma xac thuc nang cao
                // Neu chon khac 1 va 2: Hien lai menuForAuthCode
                int selectionForAuthCode;
                String expectedAuthCode;
                do {
                    menuForAuthCode();
                    selectionForAuthCode = sc.nextInt();
                    expectedAuthCode = null;

                    if (selectionForAuthCode == 1) {
                        expectedAuthCode = generateBasicAuthCode();
                        System.out.println("Nhap ma xac thuc co ban:");
                    } else if (selectionForAuthCode == 2) {
                        expectedAuthCode = generateAdvancedAuthCode();
                        System.out.println("Nhap ma xac thuc nang cao:");
                    }
                    else {
                        System.out.println("Ban da chon sai. Yeu cau chon 1 hoac 2.");
                    }
                }
                    while (selectionForAuthCode != 1 && selectionForAuthCode != 2);

                System.out.println("Nhap ma xac thuc: " + expectedAuthCode);

                String authCode;
                do {
                    authCode = sc.next();
                    // Neu nhap sai ma bao mat
                    if (!expectedAuthCode.equals(authCode)) {
                        System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
                    }
                } while (!expectedAuthCode.equals(authCode));

                // Neu nhap dung ma bao mat:
                // Nhap cccd:
                System.out.println("Nhap so CCCD:");
                // kiem tra dieu kien
                boolean kiemtraCccd = false;
                do {
                    cccd = sc.next();
                    kiemtraCccd = isValidCccd(cccd);
                    // Neu ma CCCD khong hop le:
                    if (!kiemtraCccd) {
                        if ("No".equals(cccd)) {
                            // Neu nhap No thi thoat chuong trinh
                            System.exit(0);
                        } else {
                            System.out.println("So CCCD khong hop le. Vui long nhap lai hoac 'No' de thoat:");
                        }
                    }
                    System.out.println("Ma cccd la: " + cccd);
                } while (!kiemtraCccd);

                //Luu CCCD vao 1, 2, 3
                do {
                    menu2();
                    selection = sc.nextInt();
                    if (selection == 1) {
                        birthPlace = getBirthPlace(cccd);
                        System.out.println("Ban da chon " + selection);
                        System.out.println("Noi Sinh: " + birthPlace);
                    } else if (selection == 2) {
                        int ageNumber = Integer.parseInt(cccd.substring(3, 4));
                        int yearAge = Integer.parseInt(cccd.substring(4, 6));
                        gender = getGender(ageNumber);
                        yearOfBirth = getYearOfBirth(ageNumber, yearAge);
                        System.out.println("Ban da chon " + selection);
                        System.out.println("Gioi tinh: " + gender + " | " + yearOfBirth);
                    } else if (selection == 3) {
                        String sixRandomNumber = cccd.substring(6, 12);
                        System.out.println("Ban da chon " + selection);
                        System.out.println("So ngau nhien: " + sixRandomNumber);
                    }
                } while (selection != 0);
            // Neu user chon so khac 1 va 0 thi hien lai Menu ban dau
            } else if (selection != 0) {
                menu(AUTHOR, VERSION);
            }
        } while (selection != 0);
    }
}
