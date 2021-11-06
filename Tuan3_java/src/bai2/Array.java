package bai2;

import java.util.Scanner;

public class Array {
    private int[] a;
    private int n;

    static Scanner sc = new Scanner(System.in);

    public Array(){
        n=0;
    }

    public Array(int[] a,int n){
        this.n = n;
        this.a = a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public int getN() {
        return n;
    }
    public  void inputData(){
        System.out.print("Nhap so phan tu cua mang : ");
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i] = sc.nextInt();
        }
    }

    public void Show(){
        System.out.println();
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int Sum(){
        int s = 0;
        for(int i=0;i<n;i++){
            s+=a[i];
        }
        return s;
    }

    public void Filter(boolean flag){
        System.out.println();
        if (flag == true){
            for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    System.out.print(a[i]+" ");
                }
            }
        }
        else {
            for (int i=0;i<n;i++){
                if(a[i]%2==1){
                    System.out.print(a[i]+" ");
                }
            }
        }
        System.out.println();
    }

}
