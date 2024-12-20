package Section3;

import java.util.Scanner;

public class Section3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\n======MENU======");
            System.out.println("1. Tinh tong tu 1 den 100");
            System.out.println("2. Kiem tra so chan va so le");
            System.out.println("3. Hien thi 10 lan dong Helloword");
            System.out.println("4. Thoat");
            System.out.println("Hay nhap lua chon cua ban: ");

            chon = scanner.nextInt();
            switch (chon){
                case 1:
                    int tong = 0;
                    for(int i = 1; i <=100; i++){
                        tong += i;
                    }
                    System.out.println("Tong tu 1 den 100 la: "+ tong);
                    break;
                case 2:
                    System.out.println("Nhap so can kiem tra: ");
                    int n = scanner.nextInt();
                    if(n%2 ==0){
                        System.out.println("So can kiem tra la so chan");
                    }
                    else {
                        System.out.println("So can kiem tra la so le");
                    }
                    break;
                case 3:
                    for(int i =1; i<=10; i++){
                        System.out.println("Helloword");
                    }
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh. GooodBye!");
                    break;
                default:
                    System.out.println("Khong hop le!");
            }

        }while (chon != 4);
        scanner.close();
    }
}
