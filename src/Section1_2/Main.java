package Section1_2;

public class Main {
    public static void main(String[] args) {
        Hinhvuong hinhvuong = new Hinhvuong();
        Tron tron = new Tron();
        Tamgiacvuong tamgiacvuong = new Tamgiacvuong();
        HCN hcn = new HCN();

        //Hinh vuong
        System.out.println("Chu vi hinh vuong: "+hinhvuong.chuvi(5));
        System.out.println("Dien tich hinh vuong: "+hinhvuong.dientich(5));

        //Hinh tron
        System.out.println("Chu vi hinh tron: "+tron.chuvi(5));
        System.out.println("Dien tich hinh tron: "+tron.dientich(5));

        //Tamgiacvuong
        System.out.println("Chu vi tam giac vuong: "+tamgiacvuong.chuvi(3,4));
        System.out.println("Dien tich tam giac vuong: " + tamgiacvuong.dientich(3,4));

        //Hinh chu nhat
        System.out.println("Chu vi hinh chu nhat: "+ hcn.chuvi(4,5));
        System.out.println("Dien tich hinh chu nhat: "+hcn.dientich(4,5));

    }
}
