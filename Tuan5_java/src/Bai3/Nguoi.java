package Bai3;

import java.util.Scanner;

public class Nguoi {
    protected String HoTen;
    protected String NgaySinh;
    protected String QueQuan;
    public Nguoi(){

    }
    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        QueQuan = queQuan;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten : ");
        HoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh : ");
        NgaySinh = sc.nextLine();
        System.out.print("Nhap que quan : ");
        QueQuan = sc.nextLine();
    }
    public void Xuat() {
        System.out.println("Ho ten : " + HoTen);
        System.out.println("Ngay sinh : " + NgaySinh);
        System.out.println("Que quan : " + QueQuan);
    }
}
