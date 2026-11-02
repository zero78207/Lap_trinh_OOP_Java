package Thuchanh6.DanhSachSV.Clients;

import java.time.Year;

import Thuchanh6.DanhSachSV.Entities.SV;
import Thuchanh6.DanhSachSV.Entities.SVSP;
import Thuchanh6.DanhSachSV.Entities.SVTH;
import Thuchanh6.DanhSachSV.Management.DanhSachSinhVien;

public class Main {
    public static void main(String[] args){
        SV sv1 = new SVSP("SV001", "Vo Tran Tuan Kiet", Year.of(2007), 8.15, "DH Quy Nhon", 6.4);
        SV sv2 = new SVTH("SV002", "Nam Ngu", Year.of(2007), 7.5, "An Ninh Mang", 6.5);
        SV sv3 = new SVSP("SV003", "Kiet Beo", Year.of(2007), 8.6, "DH FPT", 6.5);
        DanhSachSinhVien ds = new DanhSachSinhVien();
        ds.them(sv3);
        ds.them(sv2);
        ds.them(sv1);
        ds.lietke();
        System.out.println("-------------------");
        ds.lietke("SVSP");
        System.out.println("-------------------");
        ds.tim("Kiet Beo");
    }
}
