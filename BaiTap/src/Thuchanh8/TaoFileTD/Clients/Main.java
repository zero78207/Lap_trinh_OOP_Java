package Thuchanh8.TaoFileTD.Clients;

import java.io.IOException;

import Thuchanh8.TaoFileTD.Management.TuDien;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        TuDien tD = new TuDien();
        tD.docFile("tuDien.txt");
        tD.hienThi();
    }
}
