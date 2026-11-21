package On_tap.Bai1.Entities;

import java.time.LocalDate;

public class Laptop extends TBChoThue{
    private int RAM;

    public Laptop(){
        super();
    }
    public Laptop(String id, String name, double donGiaTheoNgay, int soNgayThue, LocalDate ngayBatDauThue, int RAM) throws IllegalAccessException{
        super(id, name, donGiaTheoNgay, soNgayThue, ngayBatDauThue);
        try{setRAM(RAM);}catch(IllegalAccessException e){
            throw new IllegalAccessException("Loi Nhap RAM: " + e.getMessage());
        }
    }
    public void setRAM(int RAM) throws IllegalAccessException {
        if(RAM <= 0) throw new IllegalAccessException("Loi Nhap RAM Khong Hop Le!");
        this.RAM = RAM;
    }
    @Override
    public double tinhPhuThu() {
        if(RAM >= 16){
            return 50000 * soNgayThue;
        }
        return 0;
    }
    @Override
    public double donGia() {
        return super.donGia() + tinhPhuThu();
    }
    @Override
    public String loaiThietBi() {
        return "LAPTOP";
    }
    @Override
    public String toString() {
        return loaiThietBi() + super.toString() + RAM + " GB";
    }
}
