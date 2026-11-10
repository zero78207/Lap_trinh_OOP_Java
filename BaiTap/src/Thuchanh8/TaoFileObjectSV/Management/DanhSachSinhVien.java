package Thuchanh8.TaoFileObjectSV.Management;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import Thuchanh8.TaoFileObjectSV.Entities.*;
public class DanhSachSinhVien{
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
    public void ghiTep(String tenTep){
        try{
            FileOutputStream fo = new FileOutputStream(tenTep);
            PrintWriter pw = new PrintWriter(fo);
            for(SV a:ds){
                pw.println(a.toString());
                pw.close();
            }fo.close(); pw.close();
        }catch(IOException e){System.out.println("Loi Doc Tep");}
    }
    public void docTep(String tenTep){
        try{
            FileInputStream fi = new FileInputStream(tenTep);
            DataInputStream di = new DataInputStream(fi);
            String s;
            while((s = di.readLine()) != null){
                StringTokenizer st = new StringTokenizer(s, "//|");
                String mSSV = st.nextToken();
                String hoTen = st.nextToken();
                int namSinh = Integer.parseInt(st.nextToken());
                double dtb = Double.parseDouble(st.nextToken());
                String loaiSV = st.nextToken();
                SV sv;
                if(loaiSV.equals("SVSP")){
                    String noiTT = st.nextToken();
                    double diemTT = Double.parseDouble(st.nextToken());
                    sv = new SVSP(mSSV, hoTen, namSinh, dtb, noiTT, diemTT);
                    them(sv);
                }
                else{
                    String tenDT = st.nextToken();
                    double diemDT = Double.parseDouble(st.nextToken());
                    sv = new SVTH(mSSV, hoTen, namSinh, dtb, tenDT, diemDT);
                    them(sv);
                }
            }di.close(); fi.close();
        }catch(IOException e){System.out.println("Loi Doc File");}
    }
    public void ghiFileObject(String tenTep){
        try{
            FileOutputStream fo = new FileOutputStream(tenTep);
            ObjectOutputStream objout = new ObjectOutputStream(fo);
            for(SV a: ds){
                objout.writeObject(a);
            }fo.close(); objout.close();
        }catch(IOException e){System.out.println("Loi Ghi File");}
    }
    public void docFileObject(String tenTep) throws IOException, ClassNotFoundException{
        FileInputStream fi = new FileInputStream(tenTep);
        ObjectInputStream objin = new ObjectInputStream(fi);
        while(fi.available() > 0){
            SV s = (SV)objin.readObject();
            them(s);
        }fi.close(); objin.close();
    }
}
