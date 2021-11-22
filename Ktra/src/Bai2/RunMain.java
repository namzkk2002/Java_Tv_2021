package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;

public class RunMain {
    public static int Menu(){
        System.out.println("choose a anumber : ");
        System.out.println("1. Add book");
        System.out.println("2. Edit book by id");
        System.out.println("3. Delete book by id");
        System.out.println("4. Sort books by name (ascending)");
        System.out.println("5. Sort books by price (descending)");
        System.out.println("6. Show all books");
        System.out.println("7. Exit");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int n;
        System.out.print("Nhap so cuon sach muon nhap : ");
        n = sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Nhap thong tin cuon sach thu "+(i+1)+" : ");
            Book book = new Book();
            book.Input();
            books.add(book);
        }
        System.out.println("Thong tin cac sach da nhap : ");
        System.out.printf("%20s %20s %20s %20s %20s %20s\n","id","name","publisher","price","Number of page","author");
        for (int i=0;i<n;i++){
            books.get(i).Output();
        }
        System.out.println();
        int choose;
        do {
            choose = Menu();
            if(choose == 7){
                return;
            }
            else {
                switch (choose){
                    case 1:
                        n+=1;
                        System.out.println("Nhap thong tin sach muon them : ");
                        Book a = new Book();
                        a.Input();
                        books.add(a);
                        break;
                    case 3:
                        System.out.println("Nhap id sach muon xoa : ");
                        String s;
                        s = sc.nextLine();
                        for (int i=0;i<n;i++){
                            if(books.get(i).id.equalsIgnoreCase(s)==true){
                                books.remove(books.get(i));
                                break;
                            }
                        }
                        break;
                    case 4:
                        for (int i=0;i<n-1;i++){
                            for (int j=i+1;j<n;j++){
                                if(books.get(i).name.compareToIgnoreCase(books.get(j).name)>0){
                                    Collections.swap(books,i,j);
                                }
                            }
                        }
                        break;
                    case 5:
                        for (int i=0;i<n-1;i++){
                            for (int j=i+1;j<n;j++){
                                if(books.get(i).price < books.get(j).price){
                                    Collections.swap(books,i,j);
                                }
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Thong tin cac sach trong thu vien : ");
                        System.out.printf("%20s %20s %20s %20s %20s %20s\n","id","name","publisher","price","Number of page","author");
                        for (int i=0;i<n;i++){
                            books.get(i).Output();
                        }
                    case 7:
                        return;
                }
            }
        }
        while (choose>=1&&choose<=7);

    }
}
