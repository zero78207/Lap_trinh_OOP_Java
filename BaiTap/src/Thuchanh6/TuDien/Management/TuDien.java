package Thuchanh6.TuDien.Management;

import java.util.HashMap;
import java.util.Map;

import Thuchanh6.TuDien.Entities.Nghia;

public class TuDien {
    private HashMap<String, Nghia> tD;

    public TuDien(){
        tD = new HashMap<String, Nghia>();
    }
    public void themTu(String tu, Nghia nghia){
        tD.put(tu, nghia);
    }
    public void hienThi(){
        for(Map.Entry<String,Nghia> entry : tD.entrySet()){
            String tu = entry.getKey();
            String nghia = entry.getValue().getNghia();
            System.out.println(tu + " : " + nghia);
        }
    }
    public void hienThi(String tu){
        for(Map.Entry<String,Nghia> entry : tD.entrySet()){
            if(entry.getKey().equals(tu)){
                String nghia = entry.getValue().getNghia();
                System.out.println(tu + " : " + nghia);
            }
        }
    }
}
