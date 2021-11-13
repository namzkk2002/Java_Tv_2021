package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LopHoc {
    private String MaLH;
    private String TenLH;
    private String NgayMo;
    private String GiaoVien;
    private int n;
    private ArrayList<SinhVien> x;

    public LopHoc(){

    }
    public LopHoc(String maLH, String tenLH, String ngayMo, String giaoVien, int n, ArrayList<SinhVien> x) {
        MaLH = maLH;
        TenLH = tenLH;
        NgayMo = ngayMo;
        GiaoVien = giaoVien;
        this.n = n;
        this.x = x;
    }

    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String maLH) {
        MaLH = maLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public void setTenLH(String tenLH) {
        TenLH = tenLH;
    }

    public String getNgayMo() {
        return NgayMo;
    }

    public void setNgayMo(String ngayMo) {
        NgayMo = ngayMo;
    }

    public String getGiaoVien() {
        return GiaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        GiaoVien = giaoVien;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }
    public void  Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma lop hoc : ");
        MaLH = sc.nextLine();
        System.out.print("Nhap ten lop hoc : ");
        TenLH = sc.nextLine();
        System.out.print("Nhap ngay mo : ");
        NgayMo = sc.nextLine();
        System.out.print("Nhap ten giao vien : ");
        GiaoVien = sc.nextLine();
        System.out.print("Nhap n : ");
        n = sc.nextInt();
        x = new ArrayList<>(n);
        for (int i=0;i<n;i++){
            System.out.println("Nhap thong tin sinh vien thu "+(i+1)+" : ");
            SinhVien sinhVien = new SinhVien();
            sinhVien.Nhap();
            x.add(sinhVien);
        }
    }

    public void Xuat(){
        System.out.println("Ma lop : "+MaLH);
        System.out.println("ten lop : "+TenLH);
        System.out.println("Ngay mo : "+NgayMo);
        System.out.println("Giao vien : "+GiaoVien);
        for (int i=0;i<n;i++){
            System.out.println();
            System.out.println("Thong tin sinh vien thu "+(i+1)+" : ");
            System.out.println();
            x.get(i).Xuat();
        }
    }

    public void Dem(){
        int dem = 0;
        for(int i=0;i<n;i++){
            if(x.get(i).getKhoa()==15){
                dem++;
            }
        }
        System.out.println("Co "+dem+" dinh vien K15");
    }
    public void SapXep(){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(x.get(i).getKhoa()>x.get(j).getKhoa()){
                    Collections.swap(x,i,j);
                }
            }
        }
    }
}
