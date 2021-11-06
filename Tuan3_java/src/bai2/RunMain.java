package bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Array arr1 = new Array();
        System.out.println("Nhap vao mang t1 : ");
        arr1.inputData();
        arr1.Show();
        System.out.println("Sum of arr1 : " + arr1.Sum());
        System.out.print("flag1 = ");
        boolean flag1 = sc.nextBoolean();
        arr1.Filter(flag1);

        Array arr2 = new Array();
        System.out.println("Nhap vao mang t2 : ");
        arr2.inputData();
        arr2.Show();
        System.out.println("Sum of arr2 : " + arr2.Sum());
        System.out.print("flag2 = ");
        boolean flag2 = sc.nextBoolean();
        arr2.Filter(flag2);

        if((float)arr1.Sum()/arr1.getN()>(float)arr2.Sum()/arr2.getN()){
            System.out.println("Mang 1 lon hon");
        }
        else if((float)arr1.Sum()/arr1.getN()<(float)arr2.Sum()/arr2.getN()){
            System.out.println("Mang 2 lon hon");
        }
        else {
            System.out.println("Bye");
        }
    }
}
