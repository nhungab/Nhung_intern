package Section7.com.trungtamjava.model1;

import java.util.Scanner;

public class Employee {
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
        sc.nextLine();
    }

    public void info(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: "+age);
    }
}
