package Section2;

import java.util.Scanner;

public class Section2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cau hoi: 2 + 2 = ?");
        System.out.println("A. 3");
        System.out.println("B. 5");
        System.out.println("C. 4");
        System.out.println("D. 7");

        // Nhap cau tra loi
        System.out.println("Nhap cau tra loi cua ban: ");
        String traloi = scanner.nextLine().toUpperCase();

        switch (traloi){
            case "A":
                System.out.println("Cau tra loi cua ban la sai");
                break;
            case "B":
                System.out.println("Cau tra loi cua ban la sai");
                break;
            case "C":
                System.out.println("Cau tra loi Dung!");
                break;
            case "D":
                System.out.println("Cau tra loi cua ban la sai");
                break;
            default:
                System.out.println("Cau tra loi khong hop le!");
                break;
        }
        scanner.close();
    }
}
