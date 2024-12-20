//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Car{
    String color; // thuoc tinh
    int year;   //thuoc tinh

    // start(), stop() la phuong thuc(method)
    public void start(){
        System.out.println("Xe dang khoi dong...");
    }

    public void stop(){
        System.out.println("Xe dang dung...");
    }

}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color ="Do";
        myCar.year = 2020;
        myCar.start();

        // Tạo đối tượng với constructor không tham số
        //Car car1 = new Car();

        // Tạo đối tượng với constructor có tham số
        //Car car2 = new Car("Đỏ", 2022);

    }
}
// Car là một class đại diện chung cho 1 chiếc xe. myCar là một đối tượng được tạo ra từ lớp Car, nó đại diện cho một chiếc xe mau và năm cụ thể.