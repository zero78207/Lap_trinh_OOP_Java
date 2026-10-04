package Thuchanh3.TienDien;

public class TinhTien {
    private String maHo;
    private String hoTen;
    private int loaiHo;//1. Kinh Doanh; 2. Sinh Hoạt;
    private TinhDien chiSoCongTo;

    public TinhTien(String maHo, String hoTen, int loaiHo, TinhDien chiSoCongTo){
        this.maHo = maHo;
        this.hoTen = hoTen;
        this.loaiHo = loaiHo;
        this.chiSoCongTo = chiSoCongTo;
    }
    
    public String getMaHo() {
        return maHo;
    }

    public String getHoTen() {
        return hoTen;
    }
    
    public int getLoaiHo() {
        return loaiHo;
    }

    public double TinhSoCongTo(){
        return this.chiSoCongTo.ChiSoCongTo();
    }

    public double TinhTienDien(){
        double tien = 0.0f;
        if(this.loaiHo == 1){
            tien = this.TinhSoCongTo() * 3200;
        }
        else if(this.loaiHo == 2){
            tien = this.TinhSoCongTo() * 2500;
        }
        tien = tien * 0.08 + tien;
        return tien;
    }
}
