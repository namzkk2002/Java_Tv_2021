package Bai2;

import java.util.Scanner;

public class Document {
    protected String id;
    protected String name;
    protected String publisher;
    protected int price;

    public  Document(){
    }
    public Document(String id, String name, String publisher, int price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id : ");
        id = sc.nextLine();
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter publisher : ");
        publisher = sc.nextLine();
        System.out.print("Enter price : ");
        price = sc.nextInt();
    }
    public void Output(){
        System.out.printf("%20s %20s %20s %20d",id,name,publisher,price);
    }
}
