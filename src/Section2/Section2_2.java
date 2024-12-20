package Section2;

import java.util.Scanner;

public class Section2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Phuong trinh co dang: ax^2 + bx + c = 0");
        System.out.println("Nhap so a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap so b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap so c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4*a*c;

        if (a != 0){
            if(delta > 0){
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                System.out.println("Nghiem 1: " + (-b + Math.sqrt(delta))/(2*a));
                System.out.println("Nghiem 2: " + (-b - Math.sqrt(delta))/(2*a));
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep");
                System.out.println("Nghiem 1 = Nghiem 2: " + -b/(2*a));
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            System.out.println("Phuong trinh dang dac biet a = 0: bx + c = 0");
            if (b != 0){
                System.out.println("Phuong trinh co nghiem duy nhat: "+(-c/b));
            }
            else{
                if (c == 0){
                    System.out.println("Phuong trinh vo so ngiem");
                }
                else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
        }
        scanner.close();
    }
}
