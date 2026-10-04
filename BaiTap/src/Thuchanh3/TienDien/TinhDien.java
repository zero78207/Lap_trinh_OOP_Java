package Thuchanh3.TienDien;

public class TinhDien {
    private double chiSoCu;
    private double chiSoMoi;

    public TinhDien(double chiSoCu, double chiSoMoi){
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    public double getChiSoCu(){
        return this.chiSoCu;
    }
    public double getChiSoMoi(){
        return this.chiSoMoi;
    }
    public double ChiSoCongTo(){
        return Math.abs(this.chiSoMoi - this.chiSoCu);
    }
}