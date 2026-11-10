package Thuchanh8.TaoFileObjectSV.Clients;

import java.io.IOException;

import Thuchanh8.TaoFileObjectSV.Management.DanhSachSinhVien;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        DanhSachSinhVien ds = new DanhSachSinhVien();
        ds.docTep("SinhVien.txt");
        ds.ghiFileObject("SinhVien.dat");
        DanhSachSinhVien ds1 = new DanhSachSinhVien();
        ds1.docFileObject("SinhVien.dat");
        ds1.lietke();
    }
}
