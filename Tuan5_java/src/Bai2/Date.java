package Bai2;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Date {
    private int Ngay,Thang,Nam;
    public void InputDate(){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Ngay : " );
        Ngay = sc.nextInt();
        System.out.print("Thang : " );
        Thang = sc.nextInt();
        System.out.print("Nam : " );
        Nam = sc.nextInt();
    }
    public void OutputDate(){
        System.out.println(Ngay+"/"+Thang+"/"+Nam);
    }
}
