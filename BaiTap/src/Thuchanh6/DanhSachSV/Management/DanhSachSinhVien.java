package Thuchanh6.DanhSachSV.Management;
import java.util.ArrayList;

import Thuchanh6.DanhSachSV.Entities.SV;
public class DanhSachSinhVien {
    private ArrayList<SV> ds;

    public DanhSachSinhVien(){
        ds = new ArrayList<SV>();
    }
    public void them(SV a){
        if(!ds.contains(a)){
            ds.add(a);
        }
    }
    public void lietke(){
        for(SV a:ds)
            System.out.println(a);
    }
    public void lietke(String l){
        for(SV a:ds){
            if(a.loaiSV().equals(l))
                a.hienThi();
        }
    }
    public void tim(String l){
        for(SV a:ds){
            if(a.getHoTen().equals((l)))
                a.hienThi();;
        }
    }
}
