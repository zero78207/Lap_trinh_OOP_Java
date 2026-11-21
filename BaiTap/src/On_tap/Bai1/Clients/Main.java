package On_tap.Bai1.Clients;

import java.io.IOException;
import java.time.LocalDate;

import On_tap.Bai1.Entities.*;
import On_tap.Bai1.Managements.DanhSachTBChoThue;

public class Main {
    public static void main(String []args) throws ClassNotFoundException, IOException, IllegalAccessException{
        try{TBChoThue tb1 = new Laptop("LT01", "Dell Inspiron", 150000.0, 5, LocalDate.of(2026, 11, 19), 16);
        TBChoThue tb2 = new MayChieu("MC01", "Epson EB-X", 200000.0, 4, LocalDate.of(2026, 11, 19), 2500.0);
        DanhSachTBChoThue list = new DanhSachTBChoThue();
        list.them(tb1);
        list.them(tb2);
        list.lietKe();
        System.out.println("-----------------------");
        list.lietKe(300000.0);
        System.out.println("-----------------------");
        list.lietKe("Dell Inspiron");
        }catch(IllegalAccessException e){
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------");
        DanhSachTBChoThue list1 = new DanhSachTBChoThue();
        list1.docFile("ThietBi.txt");
        list1.lietKe();
    }
}
