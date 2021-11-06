package Bai2;

import java.util.Scanner;

public class Date {
    private int D,M,Y;
    Scanner sc = new Scanner(System.in);
    public void NHAP(){
        System.out.print("Ngay : ");
        D = sc.nextInt();
        System.out.print("Thang : ");
        M = sc.nextInt();
        System.out.print("Nam : ");
        Y = sc.nextInt();
    }
     public void XUAT(){
        System.out.println(D + "/" + M + "/" + Y);
    }
}
