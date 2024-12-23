package Section5.com.trungtamjava.mode;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;

    //Tạo 1 constuctor mặc đinh và một constructor tuỳ biến truyền vào tham số đầu vào cho các biến luôn.
    public Person() {

    }

    public Person(String name, int age, String gender, String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    //Tạo các hàm set get cho biến
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
