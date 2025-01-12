package Section7.com.trungtamjava.model1;

import java.util.Scanner;

public class Developer extends Employee {
    private String programLanguage;

    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Programming Language: ");
        programLanguage = sc.nextLine();
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Programming Language: " +  programLanguage);
    }

    public String getProgramLanguage(){
        return programLanguage;
    }
}
