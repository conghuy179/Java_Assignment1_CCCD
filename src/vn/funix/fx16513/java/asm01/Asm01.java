package vn.funix.fx16513.java.asm01;
import java.util.Scanner;
import java.util.Random;

public class Asm01 {
    /*
    Check tinh hop le cua cccd:
    du 12 phan tu + la 12 chu so
    Neu thoa man, return result = true;
    Khong thoa man, return false;
     */
    public static boolean validCccd(String cccd) {
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

    public static String birthPlace(String cccd) {
        String quequan;
        String matinh = cccd.substring(0,3);
        switch (matinh) {
            case "001":
                quequan = "Hanoi";
                break;
            case "002":
                quequan = "Ha Giang";
                break;
            case "003":
                quequan = "Cao Bang";
                break;
            case "004":
                quequan = "Bac Kan";
                break;
            case "005":
                quequan = "Tuyen Quang";
                break;
            case "006":
                quequan = "Lao Cai";
                break;
            case "007":
                quequan = "Dien Bien";
                break;
            case "008":
                quequan = "Lai Chau";
                break;
            case "009":
                quequan = "Son La";
                break;
            case "010":
                quequan = "Yen Bai";
                break;
            case "011":
                quequan = "Hoa Binh";
                break;
            case "012":
                quequan = "Thai Nguyen";
                break;
            case "013":
                quequan = "Lang Son";
                break;
            case "014":
                quequan = "Quang Ninh";
                break;
            case "015":
                quequan = "Bac Giang";
                break;
            case "016":
                quequan = "Phu Tho";
                break;
            case "017":
                quequan = "Vinh Phuc";
                break;
            case "018":
                quequan = "Bac Ninh";
                break;
            case "019":
                quequan = "Hai Duong";
                break;
            case "020":
                quequan = "Hai Phong";
                break;
            case "021":
                quequan = "Hung Yen";
                break;
            case "022":
                quequan = "Thai Binh";
                break;
            case "023":
                quequan = "Ha Nam";
                break;
            case "024":
                quequan = "Nam Dinh";
                break;
            case "025":
                quequan = "Ninh Binh";
                break;
            case "026":
                quequan = "Thanh Hoa";
                break;
            case "027":
                quequan = "Nghe An";
                break;
            case "028":
                quequan = "Ha Tinh";
                break;
            case "029":
                quequan = "Quang Binh";
                break;
            case "030":
                quequan = "Quang Tri";
                break;
            case "031":
                quequan = "Thua Thien Hue";
                break;
            case "032":
                quequan = "Da Nang";
                break;
            case "033":
                quequan = "Quang Nam";
                break;
            case "034":
                quequan = "Quang Ngai";
                break;
            case "035":
                quequan = "Binh Dinh";
                break;
            case "036":
                quequan = "Phu Yen";
                break;
            case "037":
                quequan = "Khanh Hoa";
                break;
            case "038":
                quequan = "Ninh Thuan";
                break;
            case "039":
                quequan = "Binh Thuan";
                break;
            case "040":
                quequan = "Kon Tum";
                break;
            case "041":
                quequan = "Gia Lai";
                break;
            case "042":
                quequan = "Dak Lak";
                break;
            case "043":
                quequan = "Dak Nong";
                break;
            case "044":
                quequan = "Lam Dong";
                break;
            case "045":
                quequan = "Binh Phuoc";
                break;
            case "046":
                quequan = "Tay Ninh";
                break;
            case "047":
                quequan = "Binh Duong";
                break;
            case "048":
                quequan = "Dong Nai";
                break;
            case "049":
                quequan = "Ba Ria - Vung Tau";
                break;
            case "050":
                quequan = "Ho CHi Minh";
                break;
            case "051":
                quequan = "Long An";
                break;
            case "052":
                quequan = "Tien Giang";
                break;
            case "053":
                quequan = "Ben Tre";
                break;
            case "054":
                quequan = "Tra Vinh";
                break;
            case "055":
                quequan = "Vinh Long";
                break;
            case "056":
                quequan = "Dong Thap";
                break;
            case "057":
                quequan = "An Giang";
                break;
            case "058":
                quequan = "Kien Giang";
                break;
            case "059":
                quequan = "Can Tho";
                break;
            case "060":
                quequan = "Hau Giang";
                break;
            case "061":
                quequan = "Soc Trang";
                break;
            case "062":
                quequan = "Bac Lieu";
                break;
            case "063":
                quequan = "Ca Mau";
                break;
            default:
                quequan = "";
                break;
        }
        return quequan;
    }
    public static String gender(String cccd, int ageNumber) {
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
    public static int age(String cccd, int ageNumber, int yearAge) {
        int theky;
        int namsinh;
        switch (ageNumber) {
            case 0:
                theky = 1900;
                break;
            case 1:
                theky = 1900;
                break;
            case 2:
                theky = 2000;
                break;
            case 3:
                theky = 2000;
                break;
            case 4:
                theky = 2100;
                break;
            case 5:
                theky = 2100;
                break;
            case 6:
                theky = 2200;
                break;
            case 7:
                theky = 2200;
                break;
            case 8:
                theky = 2300;
                break;
            case 9:
                theky = 2300;
                break;
            default:
                theky = 0;
                break;
        }
        namsinh = theky + yearAge;
        return namsinh;
    }
    public static void main(String[] args) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| NGAN HANG SO | FX16513@v1.0.0                 |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. NHAP CCCD                                  |");
        System.out.println("| 0. Thoat                                      |");
        System.out.println("+----------+-------------------------+----------+");

        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        int selectionFirst = sc.nextInt();
        int selectionSecond;
        int rm = generator.nextInt(999);
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

        if (selectionFirst == 1) {
            System.out.println("Chuc nang: " + selectionFirst);
            System.out.println("Nhap ma xac thuc: " + rm);
            int crm;
            do {
                crm = sc.nextInt();
                // Neu nhap sai rm
                if (crm!= rm) {
                    System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
                }
            }
            while (crm != rm);

            // Neu nhap dung rm:
            // Nhap cccd:
            System.out.println("Nhap so CCCD.");
            // kiem tra dieu kien
            boolean kiemtraCccd = false;
            do {
                cccd = sc.next();
                kiemtraCccd = validCccd(cccd);
                System.out.println("Ma cccd la: " + cccd);
                if (kiemtraCccd == false) {
                    System.out.println("So CCCD khong hop le. Vui long nhap lai hoac 'No' de thoat:");
                }
               // System.out.println("Kiem tra cccd la: " + kiemtra_cccd);
            }
            while (kiemtraCccd == false);

            int ageNumber = Integer.parseInt(cccd.substring(3,4));
            int yearAge = Integer.parseInt(cccd.substring(4,6));

            //Luu CCCD vao 1, 2, 3
            if (kiemtraCccd == true) {
                do {
                    System.out.println("| 1. Kiem tra noi sinh");
                    System.out.println("| 2. Kiem tra tuoi, gioi tinh");
                    System.out.println("| 3. Kiem tra so ngau nhien");
                    System.out.println("| 0. Thoat");
                    selectionSecond = sc.nextInt();
                    if (selectionSecond == 0) {
                        break;
                    }
                    else if (selectionSecond == 1) {
                        noiSinh = birthPlace(cccd);
                        System.out.println("Ban da chon " + selectionSecond);
                        System.out.println("Noi Sinh: " + noiSinh);
                    }
                    else if(selectionSecond == 2) {
                        gioiTinh = gender(cccd,ageNumber);
                        namSinh = age(cccd,ageNumber,yearAge);
                        System.out.println("Ban da chon " + selectionSecond);
                        System.out.println("Gioi tinh: " + gioiTinh + " | " + namSinh);
                    }
                    else if(selectionSecond == 3) {
                        System.out.println("Ban da chon " + selectionSecond);
                    }
                }
                while (selectionSecond != 0);
            }
        }
    }
}
