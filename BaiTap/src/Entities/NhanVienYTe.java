package Entities;

public class NhanVienYTe {
    //Thuộc tính
    protected String maNV;
    protected String hoTen;
    protected String gioiTinh;
    protected String chuyenNganh;
    protected float luongCB;

    //Phương thức
    public NhanVienYTe(String maNV, String hoTen, String gioiTinh, float luongCB){
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.luongCB = luongCB;
    }
    public String getMaNV(){
        return this.maNV;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public void setHoTen(String hoTen){
        if((hoTen != null) && (!hoTen.trim().isEmpty())){
            this.hoTen = hoTen;
        }else{
            System.out.println("Nhap ho ten khong hop le");
        }
    }
    public double tinhluong(){
        return 0;
    }
    public void hienThi(){
        System.out.println("Ma nhan vien: " + this.maNV + " ho ten" + getHoTen() + " luong: " + tinhluong());
    }
}
