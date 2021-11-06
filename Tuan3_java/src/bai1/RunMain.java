package bai1;

public class RunMain {

    public static void main(String[] args) {
        // write your code here
        Person ps1 = new Person("Phu Nam",19,"male","play game");
        Person ps2 = new Person();
        ps2.setName("Hoai Nam");
        ps2.setAge(19);
        ps2.setGender("Male");
        ps2.setHobby("Play game");

        System.out.println(ps1);

        System.out.println("Info of ps2 : ");
        System.out.print("Name : " + ps2.getName());
        System.out.print(", Age : " + ps2.getAge());
        System.out.print(", Gender : " + ps2.getGender());
        System.out.println(", Hobby : " + ps2.getHobby());

    }
}
