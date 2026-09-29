package Thuchanh3.DiemSV;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Sinhvien[] sv = new Sinhvien[1];
        Diem mon1 = new Diem("Toan Roi Rac ", 3, 10.0f, 6.5f, 7.5f);
        Diem mon2 = new Diem("Lap Trinh Co Ban ", 3, 10.0f, 10.0f, 9.5f);

        sv[0] = new Sinhvien("Tu Minh Duc ", mon1, mon2);
        System.out.println(sv[0].tinhDTB());
    }
}
