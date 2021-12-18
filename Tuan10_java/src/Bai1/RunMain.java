package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<Person> people = new ArrayList<>();
        try{
            System.out.print("Nhap so phan tu : ");
            n = Integer.parseInt(sc.nextLine());
            for(int i=0;i<n;i++){
                System.out.println("Nhap thong tin person thu "+(i+1)+" : ");
                Person x = new Person();
                x.Nhap();
                people.add(x);
            }

            Collections.sort(people);
            for (Person i : people){
                System.out.println(i.toString());
            }
            System.out.println();

            Collections.sort(people, new Comparator<Person>() {
                @Override
                public int compare(Person x1, Person x2) {
                    if(x1.getName().compareTo(x2.getName())==0){
                        return x1.getAddress().compareTo(x2.getAddress());
                    }
                    else{
                        return x1.getName().compareTo(x2.getName());
                    }
                }
            });
            for (Person i : people){
                System.out.println(i.toString());
            }
            System.out.println();
        }
        catch (Exception ex){
            System.out.println("Loi nhap");
        }
    }
}
