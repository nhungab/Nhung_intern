package Section7.com.trungtamjava.model;

import java.util.Scanner;

public class Student extends Person{
    private String studentId;

    @Override
    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap student ID");
        studentId = scanner.nextLine();
    }

    @Override
    public void info(){
        super.info();
        System.out.println("StudentId: "+studentId);
    }
}
