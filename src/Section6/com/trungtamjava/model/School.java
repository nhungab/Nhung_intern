package Section6.com.trungtamjava.model;

import java.util.Scanner;

public class School {
    private int id;
    private String schoolName;
    private String address;

    public School(){

    }
    public School(int id, String schoolName, String address){
        this.id = id;
        this.schoolName = schoolName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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
        scanner.nextLine();

        System.out.println("Nhap ten truong: ");
        setSchoolName(scanner.nextLine());

        System.out.println("Nhap dia chi: ");
        setAddress(scanner.nextLine());
    }

    public void info(){
        System.out.println("Id: "+getId());
        System.out.println("Ten truong: "+getSchoolName());
        System.out.println("Dia chi: "+getAddress());
    }
}
