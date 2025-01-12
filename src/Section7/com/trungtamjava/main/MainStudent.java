package Section7.com.trungtamjava.main;

import Section7.com.trungtamjava.model.Teacher;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so teacher: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Teacher[] teacher = new Teacher[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap thong tin teacher " + (i+1) + ":");
            teacher[i] = new Teacher();
            teacher[i].input();
        }

        System.out.println("\nThong tin teacher!");
        for(Teacher teacher1 : teacher){
            teacher1.info();
            System.out.println();
        }
    }
}
