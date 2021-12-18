package Bai1;

import java.util.Scanner;

public class Person implements Comparable<Person>{
    private String id;
    private String name;
    private String address;

    public Person() {
    }

    public Person(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id : ");
        id = sc.nextLine();
        System.out.print("Nhap ten : ");
        name = sc.nextLine();
        System.out.print("Nhap dia chi : ");
        address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person x) {
        if(this.id.compareToIgnoreCase(x.id)>0) return 1;
        else if(this.id.compareToIgnoreCase(x.id)<0) return -1;
        else return 0;
    }
}
