package Thuchanh6.DanhSachSV.Entities;

import java.time.Year;

public class SVTH extends SV{
    protected String tenDT;
    protected double diemDT;
    public SVTH(){
        super();
    }
    public SVTH(String mSSV, String hoTen, Year namSinh, double dtb, String tenDT, double diemDT){
        super(mSSV, hoTen, namSinh, dtb);
        this.tenDT = tenDT;
        this.diemDT = diemDT;
    }
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println(" ten DT: " + tenDT + " Diem TT: " + diemDT);
    }
    @Override
    public boolean duocTN() {
        return dtb >= 7.0 && diemDT >= 6.0;
    }
    @Override
    public String loaiSV() {
        return "SVTH";
    }
    @Override
    public String toString() {
        return super.toString() + "SVTH [tenDT=" + tenDT + ", diemDT=" + diemDT + "]";
    }
    
}
