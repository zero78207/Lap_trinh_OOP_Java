package Thuchanh6.QuanLyLoaiXe.Entities.Motor;

import Thuchanh6.QuanLyLoaiXe.Entities.YamahaMotor;

public class Serius extends YamahaMotor{
    private int warranty;
    public Serius(){
        super();
    }
    public Serius(String maXe, String name, double capacity, int num, int warranty) throws IllegalAccessException{
        super(maXe, name, capacity, num);
        setWarranty(warranty);
    }
    public int getWarranty() {
        return warranty;
    }
    public void setWarranty(int warranty) throws IllegalAccessException {
        if(warranty <= 0)
            throw new IllegalAccessException("Loi: Nhap Khong Hop Le");
        this.warranty = warranty;
    }
    @Override
    public void inputInfor() {
        super.inputInfor();
        while(true){
            try{
                System.out.println("Nhap thoi gian bao hanh: ");
                setWarranty(Integer.parseInt(sc.nextLine()));
                break;
            }catch(NumberFormatException e){
                System.out.println("Thoi gian bao hanh phai lon hon 0 va la so nguyen");
            }catch(IllegalAccessException e){
                System.out.println(e.getMessage());
            }
        }
    }@Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Thoi gian bao hanh: " + getWarranty());
    }
    @Override
    public void changeInfor() {
        super.changeInfor();
    }
}
