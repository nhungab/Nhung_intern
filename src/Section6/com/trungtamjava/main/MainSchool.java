package Section6.com.trungtamjava.main;

import Section6.com.trungtamjava.model.School;

import java.util.Scanner;

public class MainSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of schools: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        School[] schools = new School[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for school " + (i + 1) + ":");
            schools[i] = new School();
            schools[i].input();
        }

        System.out.println("\nHien thi thong tin trương:");
        for (School school : schools) {
            school.info();
            System.out.println();
        }

        //tim kiem
        System.out.println("Nhap ten truong can tim kiem: ");
        String ten = scanner.nextLine();

        //Hien thi ket qua tim kiem
        System.out.println("Ket qua tim kiem!");
        boolean found = false;
        for(int i = 0; i<n ; i++){
            if(schools[i].getSchoolName().toLowerCase().contains(ten.toLowerCase())){
                schools[i].info();
                System.out.println("===================================");
                found = true;
            }
        }
        if (!found){
            System.out.println("Khong co ket qua!");
        }
        scanner.close();
    }
}
