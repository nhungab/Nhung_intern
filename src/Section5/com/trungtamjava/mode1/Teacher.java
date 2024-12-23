package Section5.com.trungtamjava.mode1;

import java.util.Scanner;

public class Teacher extends Person{
    private String facility;

    public Teacher(){

    }
    public Teacher(int id, String name, String address, String facility){
        this.facility = facility;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        setId(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Nhap ten giao vien: ");
        setName(scanner.nextLine());

        System.out.println("Nhap dia chi: ");
        setAddress(scanner.nextLine());

        System.out.println("Nhap co so: ");
        setFacility(scanner.nextLine());
    }

    public void info(){
        System.out.println("Hien thi thong tin!");
        System.out.println("Id: "+getId());
        System.out.println("Ten: "+getName());
        System.out.println("Dia chi: "+getAddress());
        System.out.println("Co so: "+getFacility());
    }
}
