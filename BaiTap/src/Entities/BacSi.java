package Entities;

public class BacSi extends NhanVienYTe{
    //Thuộc tính
    private String chuyenNganh;

    //Phương thức
    public BacSi(String maNV, String hoTen, String gioiTinh, String chuyenNganh, float luongCB){
        super(maNV, hoTen, gioiTinh, luongCB);
        this.chuyenNganh = chuyenNganh;
    }

    //Phương thức riêng
    public void Khambenh(){
        System.out.println("Bac si " + hoTen + " dang kham benh");
    }

    //Phương thức chung
    @Override 
    public double tinhluong(){
        return this.luongCB * 10000000;
    }
}