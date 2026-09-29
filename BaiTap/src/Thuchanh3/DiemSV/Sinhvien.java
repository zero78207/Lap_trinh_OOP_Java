package Thuchanh3.DiemSV;

public class Sinhvien {
    private String hoTen;
    private Diem dm1;
    private Diem dm2;

    public Sinhvien(String hoTen, Diem dm1, Diem dm2){
        this.hoTen = hoTen;
        this.dm1 = dm1;
        this.dm2 = dm2;
    }
    public double tinhDTB(){
        return ((dm1.tinhDiem() + dm2.tinhDiem())/(dm1.getSotinchi() + dm2.getSotinchi()));
    }
}
