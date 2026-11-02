package Thuchanh6.QuanLyLoaiXe.Entities.Motor;

import Thuchanh6.QuanLyLoaiXe.Entities.YamahaMotor;

public class Jupiter extends YamahaMotor{
    private int warranty;
    public Jupiter(){
        super();
    }
    public Jupiter(String maXe, String name, double capacity, int num, int warrantly) throws IllegalAccessException{
        super(maXe, name, capacity, num);
        setWarrantly(warrantly);
    }
    public int getWarranty() {
        return warranty;
    }
    public void setWarrantly(int warranty) throws IllegalAccessException {
        if(warranty <= 0)
            throw new IllegalAccessException("Loi: Nhap Khong Hop Le");
        this.warranty = warranty;
    }
    @Override
    public void inputInfor(){
        super.inputInfor();
        while(true){
            try{
                System.out.println("Nhap Thoi Gian Bao Hanh: ");
                setWarrantly(Integer.parseInt(sc.nextLine()));
                break;
            }catch(NumberFormatException e){
                System.out.println("Thoi gian bao hanh phai lon hon 0 va la so nguyen");
            }catch(IllegalAccessException e){
                System.out.println(e.getMessage());
            }
        }
    }
    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("Thoi gian bao hanh: " + getWarranty());
    }
    @Override
    public void changeInfor() {
        super.changeInfor();
    }
}