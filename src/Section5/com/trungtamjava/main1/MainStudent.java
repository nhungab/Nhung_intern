package Section5.com.trungtamjava.main1;

import Section5.com.trungtamjava.mode1.Student;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Vui long nhap thong tin hoc sinh!");
        student.input();

        System.out.println("Hien thi thong tin hoc sinh!");
        student.info();
    }
}
