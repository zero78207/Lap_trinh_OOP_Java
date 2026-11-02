package Thuchanh6.QuanLyLoaiXe.Entities;

import java.util.Scanner;

public abstract class YamahaMotor implements IMotor{
    protected String maXe;
    protected String name;
    protected double capacity;
    protected Scanner sc = new Scanner(System.in);
    protected int num;

    public YamahaMotor(){
        super();
    }
    public YamahaMotor(String maXe, String name, double capacity, int num) throws IllegalAccessException{
        setMaXe(maXe);
        setName(name);
        setCapacity(capacity);
        setNum(num);
    }
    public String getMaXe() {
        return maXe;
    }
    public void setMaXe(String maXe) throws IllegalAccessException {
        if(maXe == null)
            throw new IllegalAccessException("Loi: Nhap Khong Hop Le");
        this.maXe = maXe;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) throws IllegalAccessException {
        if(name == null)
            throw new IllegalAccessException("Loi: Nhap Khong Hop Le");
        this.name = name;
    }
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) throws IllegalAccessException {
        if(capacity <= 0)
            throw new IllegalAccessException("Loi: Nhap Khong Hop Le");
        this.capacity = capacity;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) throws IllegalAccessException {
        if(num <= 0)
            throw new IllegalAccessException("Loi: Nhap Khong Hop Le");
        this.num = num;
    }
    @Override
    public void inputInfor() {
        while (true) {
            try {
                System.out.println("Nhap Ma Xe: ");
                String input = sc.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("Ma xe khong duoc de trong.");
                    continue;
                }
                setMaXe(input);
                break;
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Nhap Ten Xe: ");
                String input = sc.nextLine();
                if (input.trim().isEmpty()) {
                    System.out.println("Ten xe khong duoc de trong.");
                    continue;
                }
                setName(input);
                break;
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Nhap Dung Tich: ");
                setCapacity(Double.parseDouble(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap dung tich bang so.");
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Nhap So Truyen Luc: ");
                setNum(Integer.parseInt(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so truyen luc bang so nguyen.");
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    @Override
    public void displayInfor() {
        System.out.println("Ma xe: " + maXe);
        System.out.println("Name: " + name);
        System.out.println("Dung Tich: " + capacity);
        System.out.println("So Truyen Luc: " + num);
    }
    @Override
    public void changeInfor() {
        System.out.println("Nhap thong tin moi: ");
        inputInfor();
    }
    public abstract int getWarranty();
}
