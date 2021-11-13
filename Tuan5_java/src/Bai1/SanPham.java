package Bai1;

import java.util.Scanner;

public class SanPham {
    protected String MaSP;
    protected String TenSP;
    protected String TenHSX;
    protected String NgayNhap;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NHap ma san pham : ");
        MaSP = sc.nextLine();
        System.out.print("NHap ten san pham : ");
        TenSP = sc.nextLine();
        System.out.print("NHap ten hang san xuat : ");
        TenHSX = sc.nextLine();
        System.out.print("NHap ngay nhap san pham : ");
        NgayNhap = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma san pham : "+ MaSP);
        System.out.println("Ten san pham : "+ TenSP);
        System.out.println("ten hang san xuat : "+ TenHSX);
        System.out.println("Ngay nhap : "+ NgayNhap);
    }
    public SanPham(){
    }

    public SanPham(String maSP, String tenSP, String tenHSX, String ngayNhap) {
        MaSP = maSP;
        TenSP = tenSP;
        TenHSX = tenHSX;
        NgayNhap = ngayNhap;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String maSP) {
        MaSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public String getTenHSX() {
        return TenHSX;
    }

    public void setTenHSX(String tenHSX) {
        TenHSX = tenHSX;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        NgayNhap = ngayNhap;
    }
}
