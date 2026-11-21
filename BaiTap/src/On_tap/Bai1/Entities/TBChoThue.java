package On_tap.Bai1.Entities;

import java.time.LocalDate;

public abstract class TBChoThue implements ITBChoThue {
    protected String id;
    protected String name;
    protected double donGiaTheoNgay;
    protected int soNgayThue;
    private LocalDate ngayBatDauThue;

    public TBChoThue(){
        super();
    }
    public TBChoThue(String id, String name, double donGiaTheoNgay, int soNgayThue, LocalDate ngayBatDauThue) throws IllegalAccessException{
        try{setId(id);}catch(IllegalAccessException e){
            throw new IllegalAccessException("Loi Nhap Ma Thiet Bi: " + e.getMessage());
        }
        try{setName(name);}catch(IllegalAccessException e){
            throw new IllegalAccessException("Loi Nhap Ten Thiet Bi: " + e.getMessage());
        }
        try{setDonGiaTheoNgay(donGiaTheoNgay);}catch(IllegalAccessException e){
            throw new IllegalAccessException("Loi Nhap Don Gia: " + e.getMessage());
        }
        try{setSoNgayThue(soNgayThue);}catch(IllegalAccessException e){
            throw new IllegalAccessException("Loi Nhap So Ngay Thue: " + e.getMessage());
        }
        try{setNgayBatDauThue(ngayBatDauThue);}catch(IllegalAccessException e){
            throw new IllegalAccessException("Loi Nhap Ngay Bat Dau Thue: " + e.getMessage());
        }
    }
    
    public void setId(String id) throws IllegalAccessException {
    if (id == null || id.isBlank()) throw new IllegalAccessException("Ma thiet bi rong");
    this.id = id.trim();
    }
    public void setName(String name) throws IllegalAccessException {
        if (name == null || name.isBlank()) throw new IllegalAccessException("Ten thiet bi rong");
        this.name = name.trim();
    }
    public void setDonGiaTheoNgay(double donGiaTheoNgay) throws IllegalAccessException {
        if (Double.isNaN(donGiaTheoNgay) || Double.isInfinite(donGiaTheoNgay) || donGiaTheoNgay <= 0)
            throw new IllegalAccessException("Don gia khong hop le: " + donGiaTheoNgay);
        this.donGiaTheoNgay = donGiaTheoNgay;
    }
    public void setSoNgayThue(int soNgayThue) throws IllegalAccessException {
        if (soNgayThue <= 0) throw new IllegalAccessException("So ngay thue khong hop le: " + soNgayThue);
        this.soNgayThue = soNgayThue;
    }
    public void setNgayBatDauThue(LocalDate ngayBatDauThue) throws IllegalAccessException {
        if (ngayBatDauThue == null) throw new IllegalAccessException("Ngay bat dau thue rong");
        this.ngayBatDauThue = ngayBatDauThue;
    }
    public double donGia(){
        return donGiaTheoNgay * soNgayThue;
    }
    public abstract double tinhPhuThu();
    public LocalDate ngayKetThuc(){
        return this.ngayBatDauThue.plusDays(soNgayThue);
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "|" + id + "|" + name + "|" + donGiaTheoNgay + "|"
                + soNgayThue + "|" + ngayBatDauThue + "|" + ngayKetThuc() + "|";
    }
    
}
