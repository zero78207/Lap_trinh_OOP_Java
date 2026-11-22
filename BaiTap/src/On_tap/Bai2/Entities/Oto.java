package On_tap.Bai2.Entities;

public class Oto extends PhuongTien{
    private int soCho;
    private boolean taiXe;

    public Oto(){
        super();
    }
    public Oto(String iD, String name, double giaThueNgay, boolean daChoThue, int soCho, boolean taiXe) throws Exception{
        super(iD, name, giaThueNgay, daChoThue);
        setSoCho(soCho);
        setTaiXe(taiXe);
    }
    public void setSoCho(int soCho) throws Exception {
        if(soCho <= 0)throw new Exception("so cho khong nho hon hoac bang 0");
        this.soCho = soCho;
    }
    public void setTaiXe(boolean taiXe) {
        this.taiXe = taiXe;
    }
    @Override
    public double TinhTienThue(int soNgay) {
        double giaThue = soNgay * giaThueNgay;
        if(taiXe)
            giaThue += 200000;
        return giaThue;
    }
    @Override
    public String phanLoai() {
        return "OTO";
    }
    @Override
    public String toString() {
        return phanLoai() + super.toString() + soCho + " cho|" + taiXe;
    }
}
