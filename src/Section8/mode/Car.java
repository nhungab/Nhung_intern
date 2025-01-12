package Section8.mode;

import java.util.Scanner;
import java.util.function.Predicate;

public class Car {
    private String brand;
    private String model;
    private Person chusohuu;

    public Car(){
        this.chusohuu = null;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap brand: ");
        brand = sc.nextLine();
        System.out.println("Nhap model: ");
        model = sc.nextLine();
    }

    public void info(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Chu so huu: "+(chusohuu != null ? chusohuu.getName() : "Khong chu so huu"));

    }

    public void setChusohuu(Person chusohuu){
        this.chusohuu = chusohuu;
    }
}
