package Thuchanh1;

public class Bai1 {
    public static void main(String[] args){
        System.out.print("Nhap ban kinh r: ");
        float r = Input.inputFloat();
        float C = 2*(float)Math.PI*r;
        System.out.println("Chu vi hinh tron la: " + C);
        float S = (float)Math.PI*r*r;
        System.out.println("Dien tich hinh tron la: " + S);
    }
}
