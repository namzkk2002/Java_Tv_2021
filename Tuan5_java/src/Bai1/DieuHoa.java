package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    private double CongSuat;
    private long Giaban;

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cong suat : ");
        CongSuat = sc.nextDouble();
        System.out.print("Nhap gia ban : ");
        Giaban = sc.nextLong();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Cong suat : "+CongSuat);
        System.out.println("Gia ban : "+Giaban);
    }

    public DieuHoa(){
    }

    public DieuHoa(String maSP, String tenSP, String tenHSX, String ngayNhap, double congSuat, long giaban) {
        super(maSP, tenSP, tenHSX, ngayNhap);
        CongSuat = congSuat;
        Giaban = giaban;
    }

    public double getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(double congSuat) {
        CongSuat = congSuat;
    }

    public long getGiaban() {
        return Giaban;
    }

    public void setGiaban(long giaban) {
        Giaban = giaban;
    }
}
