package Bai3;

import java.util.Scanner;

public class Hang {
    private String Mahang;
    private String Tenhang;
    private double Dongia;
    Scanner sc = new Scanner(System.in);
    public void NHAP(){
        System.out.print("Nhap ma hang : ");
        Mahang = sc.nextLine();
        System.out.print("Nhap ten hang : ");
        Tenhang = sc.nextLine();
        System.out.print("Nhap don gia : ");
        Dongia = sc.nextDouble();
    }
    public void XUAT(){
        System.out.println("Ma hang : " + Mahang);
        System.out.println("Ten hang : " + Tenhang);
        System.out.println("Don gia : " + Dongia);
        System.out.println();
    }
}
