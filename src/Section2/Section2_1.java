package Section2;

import java.util.Scanner;

public class Section2_1 {
    public double Timsolonnhat(double a, double b, double c){
        double max;
        if (a > b && a > c){
            max = a;
        }
        else if (b > a && b >c){
            max = b;
        }
        else {
            max = c;
        }
        return max;
    }

    public double Timsonhonhat(double a, double b, double c){
        double min;
        if(a<b && a<c){
            min = a;
        } else if (b<a && b<c) {
            min = b;
        }
        else {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Section2_1 bai1 = new Section2_1();

        System.out.println("Nhap so a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap so b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap so c: ");
        double c = scanner.nextDouble();

        //Tim Max
        System.out.println("So lon nhat la: "+bai1.Timsolonnhat(a,b,c));
        System.out.println("So nho nhat la: "+bai1.Timsonhonhat(a,b,c));

        scanner.close();

    }
}
