package Section4;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Section4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot day string1: ");
        String string1 = scanner.nextLine();
        System.out.println("Do dai day vua nhap: "+string1.length());

        //kiem tra string có trong string1 khong
        System.out.println("Nhap string can kiem tra: ");
        String string = scanner.nextLine();

        // dung contain de kiem tra
        if(string1.contains(string)){
            System.out.println("Chuoi "+ string +" co trong chuoi "+string1);
        }else {
            System.out.println("Khong co");
        }

        // Kiem tra day vua nhap co bao nhieu chu "A"
        int dem = 0;
        for(int i = 0; i < string1.length(); i++){
            if (string1.charAt(i) == 'A'){
                dem ++;
            }
        }
        System.out.println("So luong ky tu A trong string1 la: "+dem);

        //Cắt chuối string1 thành mảng String bởi khoảng trắng và hàm split
        String[] cat = string1.split("\\s+");

        //Duyet va in ra
        System.out.println("Mang chua chuoi da cat!");
        for(String a:cat){
            System.out.println(a + " ");
        }
        scanner.close();
    }
}
