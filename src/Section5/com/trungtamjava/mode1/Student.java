package Section5.com.trungtamjava.mode1;

import java.util.Scanner;

public class Student extends Person{
    private String major;

    public Student(){

    }

    public Student(int id, String name, String address, String major){
        super(id, name, major);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        setId(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Nhap ten hoc sinh: ");
        setName(scanner.nextLine());

        System.out.println("Nhap dia chi: ");
        setAddress(scanner.nextLine());

        System.out.println("Nhap nganh hoc hoc sinh: ");
        setMajor(scanner.nextLine());
    }

    public void info(){
        System.out.println("Hien thi thong tin!");
        System.out.println("Id: "+getId());
        System.out.println("Ten: "+getName());
        System.out.println("Dia chi: "+getAddress());
        System.out.println("Nganh hoc: "+getMajor());
    }
}
