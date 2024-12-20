package Section2;

public class Section2_4 {
    public static String Tuoi(int tuoi){
        if (tuoi < 1){
            return "Tre so sinh";
        } else if (tuoi >= 1 && tuoi <= 3) {
            return "Em be";
        }else if (tuoi >3 && tuoi <= 18){
            return "Tre em";
        } else if (tuoi >= 18 && tuoi <= 40) {
            return "Nguoi lon";
        } else if (40 < tuoi && tuoi < 60) {
            return "Trung nien";
        }else {
            return "Nguoi gia";
        }

    }

    public static void main(String[] args) {
        System.out.println("Phân loại độ tuổi:");

        int[] ages = {0, 2, 5, 25, 45, 65};
        for (int age : ages) {
            System.out.println("Tuổi " + age + ": " + Tuoi(age));
        }
    }
}
