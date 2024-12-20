package Section4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Section4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap email can kiem tra: ");
        String email = scanner.nextLine();

        if(email.matches("^[a-zA-Z0-9]{6,}@gmail\\.com$")){
            System.out.println("Email hop le");
        }
        else {
            System.out.println("Email khong hop le");
        }
        scanner.close();
    }
}
