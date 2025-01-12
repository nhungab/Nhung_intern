package Section7.com.trungtamjava.model1;

import java.util.Scanner;

public class Leader extends Employee{
    private int teamSize;
    private static final double salary = 10000000;

    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap team size: ");
        teamSize = sc.nextInt();
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Team Size: "+teamSize);
        System.out.println("Bonus: ");
    }

    public double bonus(){
        if(teamSize > 10 ){
            return salary * 0.5;
        }
        else{
            return salary * 0.1;
        }
    }

    public int getTeamSize(){
        return teamSize;
    }
}
