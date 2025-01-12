package Section7.com.trungtamjava.main1;

import Section6.com.trungtamjava.model.School;
import Section7.com.trungtamjava.model1.Developer;
import Section7.com.trungtamjava.model1.Employee;
import Section7.com.trungtamjava.model1.Leader;
import Section7.com.trungtamjava.model1.Tester;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        while (true){
            System.out.println("Menu: ");
            System.out.println("1. Them Developer");
            System.out.println("2. Them Tester");
            System.out.println("3. Them Leader");
            System.out.println("4. Employee");
            System.out.println("5. Tim Developers with java");
            System.out.println("6. Tim Leaders with TeamSize > 10");
            System.out.println("0. Exit");
            System.out.println("Nhap lua chon: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    Developer developer = new Developer();
                    developer.input();
                    employeeList.add(developer);
                    break;
                case 2:
                    Tester tester = new Tester();
                    tester.input();
                    employeeList.add(tester);
                    break;
                case 3:
                    Leader leader = new Leader();
                    leader.input();
                    employeeList.add(leader);
                    break;
                case 4:
                    for (Employee emp: employeeList){
                        emp.info();
                        System.out.println();
                    }
                case 5:
                    System.out.println("Tim kiem Developers voi Java");
                    for(Employee emp: employeeList){
                        if(emp instanceof Developer && ((Developer) emp).getProgramLanguage().equalsIgnoreCase("Java")){
                            emp.info();
                            System.out.println();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Leader with TeamSize > 10: ");
                    for(Employee emp : employeeList){
                        if(emp instanceof Leader && ((Leader) emp).getTeamSize() > 10){
                            emp.info();
                            System.out.println();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("Invaild choice. Try again!");
            }
        }
    }
}
