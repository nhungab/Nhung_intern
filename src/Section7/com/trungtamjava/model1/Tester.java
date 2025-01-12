package Section7.com.trungtamjava.model1;


import java.util.Scanner;

public class Tester extends Employee{
    private String testTools;

    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap test tool: ");
        testTools = sc.nextLine();
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Testing Tools: "+testTools);
    }
}
