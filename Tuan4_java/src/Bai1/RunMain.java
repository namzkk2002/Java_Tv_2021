package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so cuon sach : ");
        n = sc.nextInt();
        Sach[] A = new Sach[n];
        for(int i=0;i<n;i++){
            A[i] = new Sach();
            System.out.println("Nhap thong tin sach thu "+ (i+1) + " : ");
            A[i].NHAP();
        }
        for(int i=0;i<n;i++){
            System.out.println("Thong tin sach thu "+ (i+1) + " : ");
            A[i].XUAT();
        }
    }
}
