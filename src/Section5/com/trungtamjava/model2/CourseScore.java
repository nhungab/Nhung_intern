package Section5.com.trungtamjava.model2;

import java.util.Scanner;

public class CourseScore {
    private int id;
    private Double score;
    private String name;

    public CourseScore(){

    }
    public CourseScore(int id, Double score, String name){
        this.id = id;
        this.score = score;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        setId(scanner.nextInt());

        System.out.println("Nhap diem: ");
        setScore(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Nhap ten: ");
        setName(scanner.nextLine());
    }

    public void info(){
        System.out.println("Hien thi thong tin!");
        System.out.println("Id: "+getId());
        System.out.println("Diem: "+getScore());
        System.out.println("Ten: "+getName());
    }
}
