package Bai3;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    private String MaSV;
    private String Nganh;
    private int Khoa;
    public SinhVien(){
    }
    public SinhVien(String hoTen, String ngaySinh, String queQuan, String maSV, String nganh, int khoa) {
        super(hoTen, ngaySinh, queQuan);
        MaSV = maSV;
        Nganh = nganh;
        Khoa = khoa;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien : ");
        MaSV = sc.nextLine();
        System.out.print("Nhap nganh : ");
        Nganh = sc.nextLine();
        System.out.print("Nhap khoa hoc : ");
        Khoa = sc.nextInt();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Ma sinh vien : "+MaSV);
        System.out.println("Nganh : "+Nganh);
        System.out.println("Khoa : "+Khoa);
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public int getKhoa() {
        return Khoa;
    }

    public void setKhoa(int khoa) {
        Khoa = khoa;
    }
}
