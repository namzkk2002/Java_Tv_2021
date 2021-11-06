package Bai2;

import java.util.Scanner;

public class NhanSu {
    private String Manhansu;
    private String Hoten;
    private Date NS = new Date();
    Scanner sc = new Scanner(System.in);
    public void NHAP(){
        System.out.print("Nhap ma nhan su : ");
        Manhansu = sc.nextLine();
        System.out.print("Nhap ho ten : ");
        Hoten = sc.nextLine();
        NS.NHAP();
    }
    public void XUAT(){
        System.out.println("Ma nhan su : " + Manhansu);
        System.out.println("Ho ten : " + Hoten);
        NS.XUAT();
    }
}
