package Section8.mode;

import java.util.Scanner;

public class House {
    private String adress;
    private int sophong;
    private Person chusohuu;

    public House(){
        this.chusohuu = null;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Adress: ");
        adress = sc.nextLine();
        System.out.println("Nhap so phong: ");
        sophong = sc.nextInt();
    }

    public void info(){
        System.out.println("Adress: "+adress);
        System.out.println("So phong: "+sophong);
        System.out.println("Chu so huu: " + (chusohuu != null ? chusohuu.getName() : "khong chu so huu") );

    }

    public void setChusohuu(Person chusohuu){
        this.chusohuu = chusohuu;
    }
}
