package Thuchanh5.TinhDiemHP.Client;

import Thuchanh5.TinhDiemHP.Entities.DiemHP;
import Thuchanh5.TinhDiemHP.Entities.HPLyThuyet;
import Thuchanh5.TinhDiemHP.Entities.HPThucHanh;
import Thuchanh5.TinhDiemHP.Entities.SinhVien;

public class Main {
    public static void main(String[] args){
        DiemHP Hp1 = new HPLyThuyet("Toan Roi Rac", 3, 7, 7, 7);
        DiemHP Hp2 = new HPThucHanh("Lap Rap May Tinh", 1, 10, 9, 10);
        SinhVien sv1 = new SinhVien("Tu Minh Duc", Hp1, Hp2);
        double DTB = sv1.tinhDTB();
        System.out.println(sv1.getHoTen());
        System.out.println("Mon Hoc 1: " + Hp1.layTenHP() + " So Tin Chi: " + Hp1.laySoTinChi() + " Diem Hoc Phan 1: " + sv1.getHp1());
        System.out.println("Mon Hoc 2: " + Hp2.layTenHP() + " So Tin Chi: " + Hp2.laySoTinChi() + " Diem Hoc Phan 2: " + sv1.getHp2());
        System.out.println("DTB: " + DTB);
    }
}
