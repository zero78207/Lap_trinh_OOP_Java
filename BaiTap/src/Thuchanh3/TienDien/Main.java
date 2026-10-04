package Thuchanh3.TienDien;

public class Main {
    public static void main(String[] args){
        TinhDien congto = new TinhDien(120.5, 110.75);
        TinhTien ho = new TinhTien("MH01", "Tu Minh Duc", 1, congto);
        
        System.out.println("Ma Ho: " + ho.getMaHo());
        System.out.println("Chu Ho: " + ho.getHoTen());
        System.out.println("Loai Ho: " + ho.getLoaiHo());//1. Kinh Doanh; 2. Sinh Hoạt
        System.out.println("So cong to dien ho da tieu thu: " + ho.TinhSoCongTo());
        System.out.println("So tien ho do phai tra: " + ho.TinhTienDien());
    }
}
