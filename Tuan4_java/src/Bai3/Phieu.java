package Bai3;

import java.util.Scanner;

public class Phieu {
    private String Maphieu;
    private int n;
    private Hang[] x;
    Scanner sc = new Scanner(System.in);
    public void NHAP(){
        System.out.print("Nhap ma phieu : ");
        Maphieu = sc.nextLine();
        System.out.print("Nhap so mat hang : ");
        n = sc.nextInt();
        x = new Hang[n];
        for (int i=0;i<n;i++){
            x[i] = new Hang();
            System.out.println("Nhap thong tin mat hang thu " + (i+1) + " : ");
            x[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.println();
        System.out.println("Ma phieu : " + Maphieu);
        for (int i=0;i<n;i++){
            System.out.println("Thong tin mat hang thu " + (i+1) + " : ");
            x[i].XUAT();
        }
    }
}
