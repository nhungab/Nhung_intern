package Section1_1;

public class TinhToan {
    // tong so duong
    public int tong(int a, int b){
        if(a <= 0 || b <= 0 ){
            throw new IllegalArgumentException("Chi chap nhan so nguyen duong");
        }
        return a + b;
    }
    // tong cua so thuc
    public double tong(double a, double b)
    {
        return a + b;
    }

    // hieu so duong
    public int hieu(int a , int b)
    {
        if (a <= 0 || b <= 0){
            throw new IllegalArgumentException("chi chap nhan so nguyen duong");
        }
        return a - b;
    }
    //hieu so thuc
    public double hieu(double a, double b){
        return a - b;
    }

    // tich so duong
    public int tich( int a,int b){
        if(a <= 0 || b <=0){
            throw new IllegalArgumentException("Chi chap nhan so nguyen duong");
        }
        return a*b;
    }
    // tich so thuc
    public double tich( double a, double b){
        return a*b;
    }

    //thuong so nguyen
    public double thuong( int a, int b){
        if(a<=0 || b<=0){
            throw new IllegalArgumentException("Chi chap nhan so nguyen duong");
        }
        return (double) a/b;
    }
    //thuong so thuc
    public double thuong(double a, double b)
    {
        if(b == 0){
            throw new IllegalArgumentException("Khong the chia cho so 0");
        }
        return a/b;
    }

    public static void main(String[] args) {
        TinhToan tinhToan = new TinhToan();

        //thu nghiem voi so duong
        System.out.println("Tong duong: "+ tinhToan.tong(5,5));
        System.out.println("Hieu duong: "+ tinhToan.hieu(5,5));
        System.out.println("Tich duong: "+ tinhToan.tich(5,5));
        System.out.println("Thuong duong: "+ tinhToan.thuong(5,5));

        //thu nghiem voi so thuc
        System.out.println("Tong thuc: "+ tinhToan.tong(5.5, 3.3));
        System.out.println("Hieu thuc: "+ tinhToan.hieu(5.5, 3.3));
        System.out.println("Tich thuc: "+ tinhToan.tich(5.5, 3.3));
        System.out.println("Thuong thuc: "+ tinhToan.thuong(5.5, 3.3));
    }
}
