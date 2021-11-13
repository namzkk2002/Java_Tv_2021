package Bai2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SanPham {
    private String MaSP;
    private String TenSP;
    private int SoLuong;
    private float DonGia;
    public void InputSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham : ");
        MaSP = sc.nextLine();
        System.out.print("Nhap ten san pham : ");
        TenSP = sc.nextLine();
        System.out.print("Nhap so luong : ");
        SoLuong = sc.nextInt();
        System.out.print("Nhap don gia : ");
        DonGia = sc.nextFloat();
    }
    public void OutputSP(){
        System.out.println("Ma san pham : "+MaSP);
        System.out.println("Ten san pham : "+TenSP);
        System.out.println("So luong : "+SoLuong);
        System.out.println("Don gia : "+DonGia);
        System.out.println("Tong tien : "+(SoLuong*DonGia));
    }
}
