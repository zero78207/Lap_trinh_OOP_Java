package Thuchanh6.QuanLyLoaiXe.Clients;

import Thuchanh6.QuanLyLoaiXe.Entities.YamahaMotor;
import Thuchanh6.QuanLyLoaiXe.Entities.Motor.Jupiter;
import Thuchanh6.QuanLyLoaiXe.Entities.Motor.Serius;
import Thuchanh6.QuanLyLoaiXe.Management.Yamaha;

public class Main {
    public static void main(String[] args){
        YamahaMotor mt1 = new Jupiter();
        mt1.inputInfor();
        mt1.displayInfor();
        System.out.println("------------------------");
        YamahaMotor mt2 = new Serius();
        mt2.inputInfor();
        mt2.displayInfor();
        Yamaha ds = new Yamaha();
        System.out.println("------------------------");
        ds.them(mt1);
        ds.them(mt2);
        ds.hienThi();
        System.out.println("------------------------");
        ds.sapXep();
        ds.hienThi();
        System.out.println("------------------------");
        ds.hienThi("Serius");
    }
}
