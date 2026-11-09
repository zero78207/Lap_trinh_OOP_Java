package Thuchanh7.TaoFileSV.Entities;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public abstract class SV implements ISV {
    protected String mSSV;
    protected String hoTen;
    protected int namSinh;
    protected double dtb;

    public SV(){
        super();
    }
    public SV(String mSSV, String hoTen, int namSinh, double dtb){
        this.mSSV = mSSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.dtb = dtb;
    }
    public void hienThi() {
        System.out.println(toString());
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    @Override
    public String toString() {
        return "|" + mSSV + "|" + hoTen + "|" + namSinh + "|" + dtb + "|";
    }
    public void ghiTep(String tenTep){
        try{
            FileOutputStream fo = new FileOutputStream(tenTep);
            PrintWriter pw = new PrintWriter(fo);
            pw.println(this);
            pw.close();
        }catch(IOException e){System.out.println("Loi Doc File!");}
    }
    public void docTep(String tenTep){
        try{
            FileInputStream fi = new FileInputStream(tenTep);
            DataInputStream di = new DataInputStream(fi);
            String s = di.readLine();
            StringTokenizer st = new StringTokenizer(s, "//|");
            mSSV = st.nextToken();
            hoTen = st.nextToken();
            namSinh = Integer.parseInt(st.nextToken());
            dtb = Double.parseDouble(st.nextToken());
            di.close();
        }catch(IOException e){System.out.println("Loi Doc Tep!");}
    }
}
