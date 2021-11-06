package bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = sc.nextInt();
        int[] a = new int[1000];
        int Chon;
        do {
            System.out.println("----------------Menu----------------");
            System.out.println("1. Nhap mang voi n so nguyen");
            System.out.println("2. Xuat mang");
            System.out.println("3. Them 1 phan tu vao vi tri bat ki");
            System.out.println("4. Xoa 1 phan tu o 1 vi tri bat ki");
            System.out.println("5. Xuat mguoc mang");
            System.out.println("6. Xuat a[1] va cac so chia het cho a[1]");
            System.out.println("7. In ra tong cac so nguyen to co trong mang");
            System.out.println("8. Thoat");
            System.out.println("Khuyen cao chon tinh nang 1 dau tien, cac lenh xoa, them nen ket hop vwoi Xuat");
            System.out.print("chon tinh nang :");
            Chon = sc.nextInt();
            switch (Chon) {
                case 1:
                    Nhap(a,n);
                    break;
                case 2:
                    Xuat(a,n);
                    break;
                case 3:
                    n++;
                    Chen(a,n);
                    Xuat(a,n);
                    break;
                case 4:
                    Xoa(a,n);
                    n--;
                    Xuat(a,n);
                    break;
                case 5:
                    Xuat_RV(a,n);
                    break;
                case 6:
                    Chia_Het(a,n);
                    break;
                case 7:
                    Tong_NT(a,n);
                    break;
                case 8:
                    return;
            }
        }while (Chon > 0&&Chon < 9);
//        Nhap(a,n);
//        Xuat(a,n);
//        n++;
//        Chen(a,n);
//        Xoa(a,n);
//        n--;
//        Xuat(a,n);


    }
    public static void Nhap(int[] a,int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i] = sc.nextInt();
        }
    }
    public static void Xuat(int[] a,int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void Chen(int[] a,int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vi tri can chen :");
        int k = sc.nextInt();
        System.out.print("Nhap phan tu can chen : ");
        int s = sc.nextInt();
        for(int i=n-1;i>k;i--){
            a[i]=a[i-1];
        }
        a[k]=s;
    }
    public static void Xoa(int[] a,int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mhap vi tri can xoa : ");
        int k = sc.nextInt();
        for(int i=k;i<n-1;i++){
            a[i]=a[i+1];
        }
    }
    public static void Xuat_RV(int[] a,int n){
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void Chia_Het(int[] a,int n){
        for(int i=0;i<n;i++){
            if(i==1||a[i]%a[1]==0){
                System.out.println(a[i]+ " ");
            }
        }
    }
    public static boolean Check(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void Tong_NT(int[] a,int n){
        int s=0;
        for(int i=0;i<n;i++){
            if(Check(a[i])== true ){
                s+=a[i];
            }
        }
        System.out.println("Tong cac so nguyen to trong mang la : " +s);
    }
}
