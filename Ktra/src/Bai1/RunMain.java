package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int t = 0;
        int s = 1;
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        int n = str.length();
        for (int i = 0 ; i < n ; i++ ){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                t+=1;
                s *= (int) str.charAt(i);
            }
        }
        System.out.println("Co "+t+" chu so");
        System.out.println("Tich : " + TongUoc(s));
    }
    public static int TongUoc(int x){
        int s = 1;
        for(int i=1;i<x;i++){
            if(x%i==0){
                s*=i;
            }
        }
        return s;
    }
}
