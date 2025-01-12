package Section8.mode;

import java.util.Scanner;

public class Person {
    private String id;
    private String name;
    private int age;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = sc.nextLine();
        System.out.println("Nhap name: ");
        name = sc.nextLine();
        System.out.println("Nhap age: ");
        age = sc.nextInt();
    }

    public void info(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public String getName(){
        return name;
    }
}
