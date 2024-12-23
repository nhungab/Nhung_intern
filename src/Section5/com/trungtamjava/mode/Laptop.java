package Section5.com.trungtamjava.mode;

public class Laptop {
    private String material;
    private String color;
    private Double weight;
    private Double height;

    //Tạo 1 constuctor mặc đinh và một constructor tuỳ biến truyền vào tham số đầu vào cho các biến luôn.
    public Laptop() {

    }

    public Laptop(String material, String color, Double weight, Double height){
        this.material = material;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    //Tạo các hàm set get cho biến
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public Double getHeight(){
        return height;
    }
    public void setHeight(Double height){
        this.height = height;
    }

    public Double getWeight(){
        return weight;
    }
    public void setWeight(Double weight){
        this.weight = weight;
    }
}
