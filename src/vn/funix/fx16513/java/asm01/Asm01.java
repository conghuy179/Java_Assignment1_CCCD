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

    public static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";

    /**
     * Sinh ma bao mat co ban
     *
     * @return ma bao mat co ban
     */
    public static String generateBasicAuthCode() {
        Random random = new Random();
        int authCode = 100 + random.nextInt(899);
        return String.valueOf(authCode);
    }

    public static String generateAdvancedAuthCode() {
        Random random = new Random();

        char[] randomChars = new char[6];
        for (int i = 0; i < 6; i++) {
            randomChars[i] = ALPHA_NUMERIC_STRING.charAt(random.nextInt(ALPHA_NUMERIC_STRING.length()));
        }

        return String.valueOf(randomChars);
    }

    public static void main(String[] args) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| NGAN HANG SO | FX16513@v1.0.0                 |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. NHAP CCCD                                  |");
        System.out.println("| 0. Thoat                                      |");
        System.out.println("+----------+-------------------------+----------+");

        Scanner sc = new Scanner(System.in);
        int selection;
        String cccd;

        String noiSinh;
        String gioiTinh;
        int namSinh;
        /*
        neu nhap 1:
        Hien random number de user nhap
            Nhap sai: hien dong chu + yeu cau nhap lai
            Nhap dung: duoc nhap cccd
         */

        do {
            selection = sc.nextInt();

            if (selection == 1) {
                // In ma bao mat
                String expectedAuthCode = generateBasicAuthCode();
                System.out.println("Chuc nang: " + selection);
                System.out.println("Nhap ma xac thuc: " + expectedAuthCode);

                String authCode;
                do {
                    authCode = sc.next();
                    // Neu nhap sai ma bao mat
                    if (!expectedAuthCode.equals(authCode)) {
                        System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
                    }
                } while (!expectedAuthCode.equals(authCode));

                // Neu nhap dung rm:
                // Nhap cccd:
                System.out.println("Nhap so CCCD:");
                // kiem tra dieu kien
                boolean kiemtraCccd = false;
                do {
                    cccd = sc.next();
                    kiemtraCccd = isValidCccd(cccd);
                    System.out.println("Ma cccd la: " + cccd);
                    if (!kiemtraCccd) {
                        if ("No".equals(cccd)) {
                            // Neu nhap No thi thoat chuong trinh
                            System.exit(0);
                        } else {
                            System.out.println("So CCCD khong hop le. Vui long nhap lai hoac 'No' de thoat:");
                        }
                    }
                } while (!kiemtraCccd);

                //Luu CCCD vao 1, 2, 3
                do {
                    System.out.println("| 1. Kiem tra noi sinh");
                    System.out.println("| 2. Kiem tra tuoi, gioi tinh");
                    System.out.println("| 3. Kiem tra so ngau nhien");
                    System.out.println("| 0. Thoat");
                    selection = sc.nextInt();
                    if (selection == 1) {
                        noiSinh = getBirthPlace(cccd);
                        System.out.println("Ban da chon " + selection);
                        System.out.println("Noi Sinh: " + noiSinh);
                    } else if (selection == 2) {
                        int ageNumber = Integer.parseInt(cccd.substring(3, 4));
                        int yearAge = Integer.parseInt(cccd.substring(4, 6));
                        gioiTinh = getGender(ageNumber);
                        namSinh = getYearOfBirth(ageNumber, yearAge);
                        System.out.println("Ban da chon " + selection);
                        System.out.println("Gioi tinh: " + gioiTinh + " | " + namSinh);
                    } else if (selection == 3) {
                        String sixRandomNumber = cccd.substring(6, 12);
                        System.out.println("Ban da chon " + selection);
                        System.out.println("So ngau nhien: " + sixRandomNumber);
                    }
                } while (selection != 0);

            } else if (selection != 0) {
                System.out.println("+----------+-------------------------+----------+");
                System.out.println("| NGAN HANG SO | FX16513@v1.0.0                 |");
                System.out.println("+----------+-------------------------+----------+");
                System.out.println("| 1. NHAP CCCD                                  |");
                System.out.println("| 0. Thoat                                      |");
                System.out.println("+----------+-------------------------+----------+");
            }
        } while (selection != 0);
    }
}
