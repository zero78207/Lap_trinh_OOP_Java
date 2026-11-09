package Thuchanh7.TaoFileSV.Clients;

import Thuchanh7.TaoFileSV.Management.DanhSachSinhVien;
import Thuchanh7.TaoFileSV.Entities.*;

public class Main {
    public static void main(String[] args){
        DanhSachSinhVien ds = new DanhSachSinhVien();
        ds.docTep("SinhVien.txt");
        ds.lietke();
    }
}
