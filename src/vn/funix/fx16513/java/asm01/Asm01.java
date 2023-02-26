package vn.funix.fx16513.java.asm01;
import java.util.Scanner;
import java.util.Random;
public class Asm01 {
    public static void main(String[] args) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| NGAN HANG SO | FX16513@v1.0.0                 |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. NHAP CCCD                                  |");
        System.out.println("| 0. Thoat                                      |");
        System.out.println("+----------+-------------------------+----------+");

        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();

        Random generator = new Random();
        int rm = generator.nextInt(999);
        String cccd;
        /*
        neu nhap 1:
        Hien random number de user nhap
            Nhap sai: hien dong chu + yeu cau nhap lai
            Nhap dung: duoc nhap cccd
         */

        if (selection == 1) {
            System.out.println("Chuc nang: " + selection);
            System.out.println("Nhap ma xac thuc: " + rm);
            int crm = sc.nextInt();
            // Neu nhap sai rm
            while (crm != rm) {
               System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
               crm = sc.nextInt();
           }
            // Neu nhap dung rm
            cccd = sc.next();
            System.out.println(cccd);
        }
    }
}
