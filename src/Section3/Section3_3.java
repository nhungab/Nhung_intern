package Section3;

import java.util.Scanner;

public class Section3_3 {
    public static void main(String[] args) {
        int giaithua = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            giaithua = i*(i-1);
        }
        System.out.println("Tinh giai thua n! = "+giaithua);
    }
}
