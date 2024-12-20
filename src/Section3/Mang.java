package Section3;

import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        //khoi tao mang
        int[] mang = new int[n];

        System.out.println("Nhap cac phan tu!");
        for(int i = 0;i<n;i++){
            System.out.println("Phan tu thu " + (i+1) + ": ");
            mang[i] = scanner.nextInt();
        }

        // in ra mang
        System.out.println("In ra mang");
        for (int a : mang){
            System.out.println( a + " ");
        }

        //Tong va tich
        int tong = 0;
        int tich = 1;
        for (int a:mang){
            tong += a;
            tich *= a;
        }
        System.out.println("Tong cua cac phan tu trong mang la: "+ tong);
        System.out.println("Tich cua cac phan tu trong mang la: "+ tich);

        int min = mang[0];
        int max = mang[0];
        for(int a:mang){
            if(a < min){
                min = a;
            }
            if (a > max){
                max = a;
            }
        }
        System.out.println("So lon nhat trong mang la: "+ min);
        System.out.println("So nho nhat trong mang la: "+max);

        //Sap xep tang dan
        for (int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(mang[i] > mang[j]){
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j]=temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep tang dan la: ");
        for (int a:mang){
            System.out.println(a + " ");
        }
        System.out.println();
        scanner.close();
    }
}
