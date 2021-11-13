package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String MaP;
    private String TenP;
    private Date a = new Date();
    private int n;
    ArrayList<SanPham> x;
    public void InputP(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap ma phieu : ");
        MaP = sc.nextLine();
        System.out.print("Nhap ten phieu : ");
        TenP = sc.nextLine();
        a.InputDate();
        System.out.print("Nhap n : ");
        n = sc.nextInt();
        x = new ArrayList<>(n);
        for (int i=0;i<n;i++){
            System.out.println("Nhap thong tin mat hang thu "+(i+1)+" : ");
            SanPham sanPham = new SanPham();
            sanPham.InputSP();
            x.add(sanPham);
        }
    }
    public void OutputP(){
        System.out.println("Ma phieu : "+MaP);
        System.out.println("Ten phieu : "+TenP);
        System.out.print("Date : ");
        a.OutputDate();
        for (int i=0;i<n;i++){
            System.out.println();
            System.out.println("Thong tin mat hang thu "+(i+1)+" : ");
            System.out.println();
            x.get(i).OutputSP();
        }
    }
}
