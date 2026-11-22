package On_tap.Bai2.Clients;

import java.io.IOException;

import On_tap.Bai2.Entities.*;
import On_tap.Bai2.Managements.DanhSachPhuongTien;

public class Main {
    public static void main(String []args) throws IOException{
        PhuongTien pt1 = null;
        try {
            pt1 = new motor("MT001", "PCX 125", 50000, false, 125);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        PhuongTien pt2 = null;
        try {
            pt2 = new Oto("OTO001", "Toyota", 100000, false, 8, true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(pt1.TinhTienThue(7));
        System.out.println(pt2.TinhTienThue(7));
        System.out.println(pt1.toString());
        System.out.println(pt2.toString());
        DanhSachPhuongTien list = new DanhSachPhuongTien();
        list.them(pt1);
        list.them(pt2);
        System.out.println("-------------------------------");
        list.lietKe("OTO001");
        System.out.println("-------------------------------");
        list.lietKe();
        list.xoa("OTO001");
        System.out.println("-------------------------------");
        list.lietKe();
        System.out.println("-------------------------------");
        DanhSachPhuongTien list1 = new DanhSachPhuongTien();
        list1.DocFile("PhuongTien.txt");
        list1.lietKe();
    }
}
