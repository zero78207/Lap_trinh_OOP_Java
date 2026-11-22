package On_tap.Bai1.Managements;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.StringTokenizer;

import On_tap.Bai1.Entities.*;

public class DanhSachTBChoThue {
    private ArrayList<TBChoThue> list;

    public DanhSachTBChoThue(){
        list = new ArrayList<TBChoThue>();
    }
    public void them(TBChoThue a){
        for(TBChoThue tb : list){
            if(tb.getId().equals(a.getId())){
                System.out.println("Thiet bi da ton tai!");
                return;
            }
        }list.add(a);
    }
    public void lietKe(){
        for(TBChoThue a:list){
            System.out.println(a);
        }
    }
    public void lietKe(double mucTien){
        for(TBChoThue a: list){
            if(a.donGia() >= mucTien)
                System.out.println(a);
        }
    }
    public void lietKe(String name){
        for(TBChoThue a:list){
            if(a.getName().toLowerCase().contains(name.toLowerCase()))
                System.out.println(a);
        }
    }
    public void ghiFile(String tenTep){
        try{
            FileOutputStream fo = new FileOutputStream(tenTep);
            PrintWriter pw = new PrintWriter(fo);
            for(TBChoThue a : list){
                pw.println(a.toString());
            }pw.close(); fo.close();
        }catch(IOException e){
            System.out.println("Loi Ghi File!");
        }
    }
    public void docFile(String tenTep) throws IllegalAccessException, IOException{
        FileInputStream fi = new FileInputStream(tenTep);
        DataInputStream di = new DataInputStream(fi);
        String s; int dong = 0;
        while((s = di.readLine()) != null){
            dong++;
            if(s.isBlank()) continue;
            try{
                StringTokenizer st = new StringTokenizer(s, "//|");
                String loaiThietBi = st.nextToken();
                String id = st.nextToken();
                String name = st.nextToken();
                Double donGiaTheoNgay = Double.parseDouble(st.nextToken());
                int soNgayThue = Integer.parseInt(st.nextToken());
                TBChoThue tb;
                if(loaiThietBi.equals("LAPTOP")){
                    int RAM = Integer.parseInt(st.nextToken());
                    if(RAM <= 0)
                        throw new Exception("RAM Khong Hop Le");
                    LocalDate date = LocalDate.parse(st.nextToken());
                    tb = new Laptop(id, name, donGiaTheoNgay, soNgayThue, date, RAM);
                }
                else if(loaiThietBi.equals("MAYCHIEU")){
                    double doSang = Double.parseDouble(st.nextToken());
                    if(doSang <= 0 || doSang > Double.POSITIVE_INFINITY)
                        throw new Exception();
                    LocalDate date = LocalDate.parse(st.nextToken());
                    tb = new MayChieu(id, name, donGiaTheoNgay, soNgayThue, date, doSang);
                }else throw new IllegalArgumentException("Loai Thiet Bi Khong Hop Le");
                them(tb);
            }catch(Exception e){
                System.out.println("Loi dong " + dong + ": " + e.getMessage());
            }
        }di.close(); fi.close();
    }
}