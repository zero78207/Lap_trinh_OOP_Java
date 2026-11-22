package On_tap.Bai2.Entities;

public class motor extends PhuongTien{
    private double dungTich;
    
    public motor(){
        super();
    }
    public motor(String iD, String name, double giaThueNgay, boolean daChoThue, double dungTich) throws Exception{
        super(iD, name, giaThueNgay, daChoThue);
        setDungTich(dungTich);
    }
    public void setDungTich(double dungTich) throws Exception {
        if(dungTich <= 0)throw new Exception("Dung tich khong nho hon hoac bang 0");
        this.dungTich = dungTich;
    }
    @Override
    public double TinhTienThue(int soNgay){
        double giaThue = giaThueNgay * soNgay;
        if(soNgay >= 7)
            giaThue = giaThue - giaThue * 0.1;
        return giaThue;
    }
    @Override
    public String phanLoai() {
        return "MOTOR";
    }
    @Override
    public String toString() {
        return phanLoai() + super.toString() + dungTich + " cc";
    }
}
