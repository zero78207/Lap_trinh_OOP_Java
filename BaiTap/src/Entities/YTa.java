package Entities;

public class YTa extends NhanVienYTe{
    //thuộc tính
    private String phongTruc;
    //Phương thức
    public YTa(String maNV, String hoTen, String gioiTinh, String phongTruc, float luongCB){
        super(maNV, hoTen, gioiTinh, luongCB);
        this.phongTruc = phongTruc;
    }
    //Phương thức chung
    @Override
    public double tinhluong(){
        return this.luongCB * 3000000;
    }
    @Override
    public void hienThi(){
        super.hienThi();//ke thua lop cha
        System.out.println("Gioi tinh: "+gioiTinh);
    }
    //Phương thức riêng
    public void chamSocBenhNhan(){
        System.out.println("Dang cham soc benh nhan tai phong truc: " + this.phongTruc);
    }
}
