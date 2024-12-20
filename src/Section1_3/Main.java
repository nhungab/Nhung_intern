package Section1_3;

import Section1_2.HCN;
import Section1_2.Hinhvuong;
import Section1_2.Tamgiacvuong;
import Section1_2.Tron;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hinhvuong hinhvuong = new Hinhvuong();
        Tron tron = new Tron();
        Tamgiacvuong tamgiacvuong = new Tamgiacvuong();
        HCN hcn = new HCN();

        //Hinh vuong
        System.out.println("Nhap canh cua hinh vuong: ");
        double canhvuong = scanner.nextDouble();
        System.out.println("Chu vi: " + hinhvuong.chuvi(canhvuong));
        System.out.println("Dien tich: " + hinhvuong.dientich(canhvuong));

        //Hinh tron
        System.out.println("Nhap ban kinh cua hinh tron: ");
        double bankinh = scanner.nextDouble();
        System.out.println("Chu vi: " + tron.chuvi(bankinh));
        System.out.println("Dien tich: " + tron.dientich(bankinh));

        //Tam giac vuong
        System.out.println("Nhap canh a: ");
        double canha = scanner.nextDouble();
        System.out.println("Nhap canh b: ");
        double canhb = scanner.nextDouble();
        System.out.println("Chu vi: " + tamgiacvuong.chuvi(canha,canhb));
        System.out.println("Dien tich: " + tamgiacvuong.dientich(canha,canhb));

        //Hinh chu nhat
        System.out.println("Nhap chieu dai: ");
        double chieudai = scanner.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double chieurong = scanner.nextDouble();
        System.out.println("Chu vi: " + hcn.chuvi(chieudai,chieurong));
        System.out.println("Dien tich: " + hcn.dientich(chieudai,chieurong));

        scanner.close();
    }
}
