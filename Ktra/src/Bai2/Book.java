package Bai2;

import java.util.Scanner;

public class Book extends Document{
    private int numberOfPage;
    private String author;
    public Book(){
    }

    public Book(int numberOfPage, String author) {
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public Book(String id, String name, String publisher, double price, int numberOfPage, String author) {
        super(id, name, publisher, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of page : ");
        numberOfPage = Integer.parseInt(sc.nextLine());
        System.out.print("Enter author : ");
        author = sc.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.printf("%20d %20s \n",numberOfPage,author);
        System.out.println();
    }
}
