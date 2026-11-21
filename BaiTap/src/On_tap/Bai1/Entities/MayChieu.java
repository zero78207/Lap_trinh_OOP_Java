package On_tap.Bai1.Entities;

import java.time.LocalDate;

public class MayChieu extends TBChoThue{
    private double doSang;

    public MayChieu(){
        super();
    }
    public MayChieu(String id, String name, double donGiaTheoNgay, int soNgayThue, LocalDate ngayBatDauThue, double doSang) throws IllegalAccessException{
        super(id, name, donGiaTheoNgay, soNgayThue, ngayBatDauThue);
        try{setDoSang(doSang);}catch(IllegalAccessException e){
            throw new IllegalAccessException("Loi Nhap Do Sang: " + e.getMessage());
        }
    }
    public void setDoSang(double doSang) throws IllegalAccessException {
        if(Double.isNaN(doSang) || Double.isInfinite(doSang) || doSang <= 0) throw new IllegalAccessException("Do sang khong hop le: " + doSang);
        this.doSang = doSang;
    }
    @Override
    public double tinhPhuThu() {
        if(doSang >= 3000){
            return 100000 * soNgayThue;
        }
        return 0;
    }
    @Override
    public double donGia() {
        return super.donGia() + tinhPhuThu();
    }
    @Override
    public String loaiThietBi() {
        return "MAYCHIEU";
    }
    @Override
    public String toString() {
        return loaiThietBi() + super.toString() + doSang + " ANSI Lumen";
    }
    
}
