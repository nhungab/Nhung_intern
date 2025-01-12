package Section7.com.trungtamjava.model;

import java.util.Scanner;

public class Person {
    private int id;
    private int age;
    private String address;

    public Person(){

    }
    public Person(int id, int age, String address){
        this.id = id;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        setId(scanner.nextInt());

        System.out.println("Nhap tuoi: ");
        setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Nhap dia chi: ");
        setAddress(scanner.nextLine());
    }

    public void info(){
        System.out.println("Id: " + getId());
        System.out.println("Tuoi: "+getAge());
        System.out.println("Dia chi: "+getAddress());
    }
}
