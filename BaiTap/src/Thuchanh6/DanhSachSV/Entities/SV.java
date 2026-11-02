package Thuchanh6.DanhSachSV.Entities;

import java.time.Year;

public abstract class SV {
    protected String mSSV;
    protected String hoTen;
    protected Year namSinh;
    protected double dtb;

    public SV(){
        super();
    }
    public SV(String mSSV, String hoTen, Year namSinh, double dtb){
        this.mSSV = mSSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.dtb = dtb;
    }
    public void hienThi() {
        System.out.println("mSSV: " + mSSV + " Ho Ten: " + hoTen + " Nam Sinh: " + namSinh);
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    @Override
    public String toString() {
        return "SV [mSSV=" + mSSV + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", dtb=" + dtb + "]";
    }
    public abstract boolean duocTN();
    public abstract String loaiSV();
}
