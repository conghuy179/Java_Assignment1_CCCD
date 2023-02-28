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
        String quequan;
        String matinh = cccd.substring(0, 3);
        switch (matinh) {
            case "001":
                quequan = "Hanoi";
                break;
            case "002":
                quequan = "Ha Giang";
                break;
            case "004":
                quequan = "Cao Bang";
                break;
            case "006":
                quequan = "Bac Kan";
                break;
            case "008":
                quequan = "Tuyen Quang";
                break;
            case "010":
                quequan = "Lao Cai";
                break;
            case "011":
                quequan = "Dien Bien";
                break;
            case "012":
                quequan = "Lai Chau";
                break;
            case "014":
                quequan = "Son La";
                break;
            case "015":
                quequan = "Yen Bai";
                break;
            case "017":
                quequan = "Hoa Binh";
                break;
            case "019":
                quequan = "Thai Nguyen";
                break;
            case "020":
                quequan = "Lang Son";
                break;
            case "022":
                quequan = "Quang Ninh";
                break;
            case "024":
                quequan = "Bac Giang";
                break;
            case "025":
                quequan = "Phu Tho";
                break;
            case "026":
                quequan = "Vinh Phuc";
                break;
            case "027":
                quequan = "Bac Ninh";
                break;
            case "030":
                quequan = "Hai Duong";
                break;
            case "031":
                quequan = "Hai Phong";
                break;
            case "033":
                quequan = "Hung Yen";
                break;
            case "034":
                quequan = "Thai Binh";
                break;
            case "035":
                quequan = "Ha Nam";
                break;
            case "036":
                quequan = "Nam Dinh";
                break;
            case "037":
                quequan = "Ninh Binh";
                break;
            case "038":
                quequan = "Thanh Hoa";
                break;
            case "040":
                quequan = "Nghe An";
                break;
            case "042":
                quequan = "Ha Tinh";
                break;
            case "044":
                quequan = "Quang Binh";
                break;
            case "045":
                quequan = "Quang Tri";
                break;
            case "046":
                quequan = "Thua Thien Hue";
                break;
            case "048":
                quequan = "Da Nang";
                break;
            case "049":
                quequan = "Quang Nam";
                break;
            case "051":
                quequan = "Quang Ngai";
                break;
            case "052":
                quequan = "Binh Dinh";
                break;
            case "054":
                quequan = "Phu Yen";
                break;
            case "056":
                quequan = "Khanh Hoa";
                break;
            case "058":
                quequan = "Ninh Thuan";
                break;
            case "060":
                quequan = "Binh Thuan";
                break;
            case "062":
                quequan = "Kon Tum";
                break;
            case "064":
                quequan = "Gia Lai";
                break;
            case "066":
                quequan = "Dak Lak";
                break;
            case "067":
                quequan = "Dak Nong";
                break;
            case "068":
                quequan = "Lam Dong";
                break;
            case "070":
                quequan = "Binh Phuoc";
                break;
            case "072":
                quequan = "Tay Ninh";
                break;
            case "074":
                quequan = "Binh Duong";
                break;
            case "075":
                quequan = "Dong Nai";
                break;
            case "077":
                quequan = "Ba Ria - Vung Tau";
                break;
            case "079":
                quequan = "Ho Chi Minh";
                break;
            case "080":
                quequan = "Long An";
                break;
            case "082":
                quequan = "Tien Giang";
                break;
            case "083":
                quequan = "Ben Tre";
                break;
            case "084":
                quequan = "Tra Vinh";
                break;
            case "086":
                quequan = "Vinh Long";
                break;
            case "087":
                quequan = "Dong Thap";
                break;
            case "089":
                quequan = "An Giang";
                break;
            case "091":
                quequan = "Kien Giang";
                break;
            case "092":
                quequan = "Can Tho";
                break;
            case "093":
                quequan = "Hau Giang";
                break;
            case "094":
                quequan = "Soc Trang";
                break;
            case "095":
                quequan = "Bac Lieu";
                break;
            case "096":
                quequan = "Ca Mau";
                break;
            default:
                quequan = "";
                break;
        }
        return quequan;
    }

    public static String getGender(String cccd, int ageNumber) {
        String gioitinh;
        switch (ageNumber) {
            case 0:
                gioitinh = "nam";
                break;
            case 1:
                gioitinh = "nu";
                break;
            case 2:
                gioitinh = "nam";
                break;
            case 3:
                gioitinh = "nu";
                break;
            case 4:
                gioitinh = "nam";
                break;
            case 5:
                gioitinh = "nu";
                break;
            case 6:
                gioitinh = "nam";
                break;
            case 7:
                gioitinh = "nu";
                break;
            case 8:
                gioitinh = "nam";
                break;
            case 9:
                gioitinh = "nu";
                break;
            default:
                gioitinh = "";
                break;
        }
        return gioitinh;
    }

    public static int getYearOfBirth(String cccd, int ageCode, int age) {
        int theky;

        switch (ageCode) {
            case 0: case 1:
                theky = 1900;
                break;
            case 2: case 3:
                theky = 2000;
                break;
            case 4: case 5:
                theky = 2100;
                break;
            case 6: case 7:
                theky = 2200;
                break;
            case 8: case 9:
                theky = 2300;
                break;
            default:
                theky = 0;
                break;
        }

        return theky + age;
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
                        gioiTinh = getGender(cccd, ageNumber);
                        namSinh = getYearOfBirth(cccd, ageNumber, yearAge);
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
