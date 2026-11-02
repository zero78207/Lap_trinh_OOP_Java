package Thuchanh6.QuanLyLoaiXe.Management;

import java.util.ArrayList;
import java.util.Comparator;

import Thuchanh6.QuanLyLoaiXe.Entities.YamahaMotor;

public class Yamaha {
    private ArrayList<YamahaMotor> ds;
    public Yamaha(){
        ds = new ArrayList<YamahaMotor>();
    }
    public void them(YamahaMotor a){
        if(!ds.contains(a)){
            ds.add(a);
        }
    }
    public void sapXep(){
        ds.sort(Comparator.comparingInt(YamahaMotor::getWarranty));
    }
    public void hienThi(){
        for(YamahaMotor a:ds){
            a.displayInfor();
        }
    }
    public void hienThi(String l){
        for(YamahaMotor a:ds){
            if(a.getName().equals(l))
                a.displayInfor();
        }
    }
}
