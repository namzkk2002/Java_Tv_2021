package Bai4;

import java.util.Scanner;

public class May {
    private String Mamay;
    private  String Kieumay;
    private  String Tinhtrang;
    Scanner sc = new Scanner(System.in);
    public void NHAP(){
        System.out.print("Nhap ma may : ");
        Mamay = sc.nextLine();
        System.out.print("Nhap kieu may : ");
        Kieumay = sc.nextLine();
        System.out.print("Nhap tinh trang : ");
        Tinhtrang = sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Ma may : " + Mamay);
        System.out.println("Kieu may : " + Kieumay);
        System.out.println("Tinh trang : " + Tinhtrang);
        System.out.println();
    }
}
