package Section1_4;

import java.util.Scanner;

public class Thuvien {
    public double Canbac2(double a){
        return Math.sqrt(a);
    }
    public double Binhphuong(double a){
        return a*a;
    }
    public double Pi(double a){
        return Math.PI*a;
    }

    public static void main(String[] args) {
        Thuvien thuvien = new Thuvien();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        double a = scanner.nextDouble();
        System.out.println("Cong thu 1: " + thuvien.Canbac2(a));
        System.out.println("Cong thu 2: " + thuvien.Binhphuong(a));
        System.out.println("Cong thu 3: " + thuvien.Pi(a));
    }
}
