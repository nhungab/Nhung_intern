package Section5.com.trungtamjava.main;

import Section5.com.trungtamjava.mode.Chair;

public class MainStudent {
    public static void main(String[] args) {
        //Dung contructor mac dinh
        Chair chair1 =  new Chair();
        chair1.setMaterial("Go");
        chair1.setColor("Nau");
        chair1.setHeight(1.2);
        chair1.setWeight(1.4);

        //Dung contructor tuy bien
        Chair chair2 = new Chair("Nhua", "Xanh",1.2,1.4);

        //Hien thi du lieu
        System.out.println("Chair2: Material = " + chair2.getMaterial() + ", Color = " + chair2.getColor() + ", Height = "+ chair2.getHeight() + ", Weight = " + chair2.getWeight());
        System.out.println("Chair1: Material = " + chair1.getMaterial() + ", Color = " + chair1.getColor() + ", Height = "+ chair1.getHeight() + ", Weight = " + chair1.getWeight());
    }
}
