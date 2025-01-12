package Section5.com.trungtamjava.main2;

import Section5.com.trungtamjava.model2.CourseScore;

public class main {
    public static void main(String[] args) {
        CourseScore courseScore = new CourseScore();
        System.out.println("Vui long nhap thong tin!");
        courseScore.input();
        System.out.println("Hien thi thong tin");
        courseScore.info();
    }
}
