package Thuchanh1;

public class Bai2 {
    public static void main(String[] args){
        System.out.println("Nhap so nguyen a va b: ");
        int a = Input.inputInt();
        int b = Input.inputInt();
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            float x = (float)-b/a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }
}