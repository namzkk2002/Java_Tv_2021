package bai4;

import java.lang.*;
import java.util.Locale;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String str = sc.nextLine();
        str=str.trim().toLowerCase();
        str = str.replaceAll("\\s+", " ");
        str = str.replaceAll("[0-9]","");
        String[] temp= str.split(" ");
        str="";
        for(int i=0;i<temp.length;i++) {
            str+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                str+=" ";
        }
        System.out.println(str);

    }
}
