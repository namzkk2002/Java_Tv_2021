package bai3;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String str = sc.nextLine();
        int dem = 0,tong = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                tong+= str.charAt(i)-48;
                dem++;
            }
        }
        if(dem!=0){
            System.out.println("true");
            System.out.println("TBC cac chu so trong chuoi = " + (float)tong/dem);
        }
        else {
            System.out.println("false");
        }
    }
}
