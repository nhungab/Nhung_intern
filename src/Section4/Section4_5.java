package Section4;

import java.util.Scanner;

public class Section4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so dien thoai: ");
        String phone = scanner.nextLine();
        // Kiểm tra điều kiện số điện thoại hợp lệ
        if (!phone.matches("^0\\d{9}$")) {
            System.out.println("Số điện thoại không hợp lệ.");
        } else {
            System.out.println("Số điện thoại hợp lệ.");
        }

        scanner.close();

    }
}
