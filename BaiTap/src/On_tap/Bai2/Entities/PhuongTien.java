package On_tap.Bai2.Entities;

public abstract class PhuongTien implements IPhuongTien{
    protected String iD;
    protected String name;
    protected double giaThueNgay;
    protected boolean daChoThue;

    public PhuongTien(){
        super();
    }
    public PhuongTien(String iD, String name, double giaThueNgay, boolean daChoThue) throws Exception{
        setiD(iD);
        setName(name);
        setGiaThueNgay(giaThueNgay);
        setDaChoThue(daChoThue);
    }
    public void setiD(String iD) throws Exception {
        if(iD == null || iD.isBlank())throw new Exception("Thieu ma dinh danh");
        this.iD = iD;
    }
    public void setName(String name) throws Exception {
        if(name == null)throw new Exception("Thieu ten xe");
        this.name = name;
    }
    public void setGiaThueNgay(double giaThueNgay) throws Exception {
        if(giaThueNgay <= 0)throw new Exception("Gia Thue khong nho hon hoac bang 0");
        this.giaThueNgay = giaThueNgay;
    }
    public void setDaChoThue(boolean daChoThue) {
        this.daChoThue = daChoThue;
    }
    @Override
    public String toString() {
        return "|" + iD + "|" + name + "|" + giaThueNgay + "|" + daChoThue
                + "|";
    }
    public String getiD() {
        return iD;
    }
    
}
