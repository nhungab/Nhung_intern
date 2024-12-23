package Section5.com.trungtamjava.main1;

import Section5.com.trungtamjava.mode1.Teacher;

public class MainTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("Vui long nhap thong tin giao vien!");
        teacher.input();

        System.out.println("Hien thi thong tin giao vien!");
        teacher.info();
    }
}
