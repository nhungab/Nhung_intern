package Section7.com.trungtamjava.main;

import Section7.com.trungtamjava.model.Student;

import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so student: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];
        for(int i = 0; i < n; i++ ){
            System.out.println("Nhap thong tin student "+ (i+1) + ":");
            students[i] = new Student();
            students[i].input();
        }

        System.out.println("\nThong tin student! ");
        for(Student student: students){
            student.info();
            System.out.println();
        }
    }
}
