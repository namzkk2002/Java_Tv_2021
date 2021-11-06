package Bai4;

import java.util.Scanner;

public class QuanLy {
    private String Maql;
    private String Hoten;
    Scanner sc = new Scanner(System.in);
    public void NHAP(){
        System.out.print("Nhap ma quan li : ");
        Maql = sc.nextLine();
        System.out.print("Nhap ho ten quan li : ");
        Hoten = sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Ma quan li : "+Maql);
        System.out.println("Ten quan li : "+Hoten);
        System.out.println();
    }
}
