package Bai4;

import java.util.Scanner;

public class PhongMay {
    private String Maphong;
    private String Tenphong;
    private double Dientich;
    private QuanLy x = new QuanLy();
    private May[] y;
    private int n;
    Scanner sc = new Scanner(System.in);
    public void NHAP(){
        System.out.print("Nhap ma phong : ");
        Maphong = sc.nextLine();
        System.out.print("Nhap ten phong : ");
        Tenphong = sc.nextLine();
        System.out.print("Nhap dien tich phong : ");
        Dientich = sc.nextDouble();
        x.NHAP();
        System.out.print("Nhap so luong may : ");
        n = sc.nextInt();
        y = new May[n];
        for (int i=0;i<n;i++){
            y[i] = new May();
            System.out.println("Nhap thong tin may thu "+(i+1)+" : ");
            y[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.println();
        System.out.println("Ma phong : "+Maphong);
        System.out.println("Ten phong : "+ Tenphong);
        System.out.println("Dien tich : "+Dientich);
        x.XUAT();
        for (int i=0;i<n;i++){
            System.out.println("Thong tin may thu "+(i+1)+" : ");
            y[i].XUAT();
        }
    }
}
