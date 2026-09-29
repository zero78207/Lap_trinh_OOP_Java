package Thuchanh3.DiemSV;

public class Diem {
    private String tenHocPhan;
    private int soTinChi;
    private double chuyenCan;
    private double giuaKy;
    private double cuoiKy;
    
    public Diem(String tenHocPhan, int soTinChi, double chuyenCan, double giuaky, double cuoiKy){
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaky;
        this.cuoiKy = cuoiKy;
    }
    public int getSotinchi(){
        return this.soTinChi;
    }
    public double tinhDiem(){
        double tongdiem = 0;
        tongdiem = this.chuyenCan * 0.1 + this.giuaKy * 0.2 + this.cuoiKy * 0.7;
        return tongdiem * soTinChi;
    }
}
