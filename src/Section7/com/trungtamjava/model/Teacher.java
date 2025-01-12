package Section7.com.trungtamjava.model;

import java.util.Scanner;

public class Teacher extends Person {
    private String teacherId;

    @Override
    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap teacher Id: ");
        teacherId = scanner.nextLine();
    }

    @Override
    public void info(){
        super.info();
        System.out.println("TeacherId "+teacherId);
    }
}
