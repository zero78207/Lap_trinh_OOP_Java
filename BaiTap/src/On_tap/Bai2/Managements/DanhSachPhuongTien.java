package On_tap.Bai2.Managements;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

import On_tap.Bai2.Entities.*;

public class DanhSachPhuongTien {
    private ArrayList<PhuongTien> list;

    public DanhSachPhuongTien(){
        list = new ArrayList<PhuongTien>();
    }

    public void them(PhuongTien a){
        for(PhuongTien pt:list){
            if(pt.getiD().equals(a.getiD())){
                System.out.println("Phuong tien da ton tai!");
                return;
            }
        }list.add(a);
    }
    public void lietKe(){
        for(PhuongTien a:list){
            System.out.println(a);
        }
    }
    public boolean xoa(String iD){
        return list.removeIf(p -> p.getiD().equalsIgnoreCase(iD));
    }
    public void lietKe(String a){
        for(PhuongTien b:list){
            if(b.getiD().equalsIgnoreCase(a))
                System.out.println(b);
        }
    }
    public void DocFile(String tenFile) throws IOException{
        FileInputStream fi = new FileInputStream(tenFile);
        DataInputStream di = new DataInputStream(fi);
        String s; int dong = 0;
        while((s = di.readLine()) != null){
            dong++;
            if(s.isBlank()) continue;
            try{
                StringTokenizer st = new StringTokenizer(s, ",");
                String phanLoai = st.nextToken();
                String iD = st.nextToken();
                String name = st.nextToken();
                double giaThueNgay = Double.parseDouble(st.nextToken());
                boolean daChoThue = Boolean.parseBoolean(st.nextToken());
                
                PhuongTien pt = null;
                if(phanLoai.equals("MOTOR")){
                    double dungTich = Double.parseDouble(st.nextToken());
                    if(dungTich <= 0)throw new Exception("Dung Tich Khong Hop Le!");
                    pt = new motor(iD, name, giaThueNgay, daChoThue, dungTich);
                }else if(phanLoai.equals("OTO")){
                    int soCho = Integer.parseInt(st.nextToken());
                    if(soCho <= 0)throw new Exception("So Cho Khong Hop Le!");
                    boolean taiXe = Boolean.parseBoolean(st.nextToken());
                    pt = new Oto(iD, name, giaThueNgay, daChoThue, soCho, taiXe);
                }else throw new ClassNotFoundException("Loai Phuong Tien Khong Hop Le");
                them(pt);
            }catch(Exception e){
                System.out.println("Loi dong " + dong + ": " +e.getMessage());
            }
        }di.close(); fi.close();
    }
}
