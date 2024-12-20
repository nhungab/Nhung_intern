package Section4;

import java.util.Scanner;

public class Section4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số điện thoại cần kiem tra: ");
        String phone = scanner.nextLine();

        //substring lay ky tu
        String dauso = phone.substring(0,4);

        if(dauso.equals("0900") || dauso.equals("0930")){
            System.out.println("Nha mang Viettel");
        }
        else if (dauso.equals("0910") || dauso.equals("0920")){
            System.out.println("Nha mang Mobifone");
        }
        else {
            System.out.println("Khong xac dinh");
        }
        scanner.close();
    }
}
