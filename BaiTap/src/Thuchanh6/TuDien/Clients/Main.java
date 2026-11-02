package Thuchanh6.TuDien.Clients;

import Thuchanh6.TuDien.Entities.Nghia;
import Thuchanh6.TuDien.Management.TuDien;

public class Main {
    public static void main(String[] args) {
        Nghia nghia1 = new Nghia("Apple", "danh từ", "A fruit that is typically red, green, or yellow and has a sweet taste.");
        Nghia nghia2 = new Nghia("Banana", "danh từ", "A long curved fruit that grows in clusters and has soft pulpy flesh and yellow skin when ripe.");
        TuDien tuDien = new TuDien();
        tuDien.themTu("Apple", nghia1);
        tuDien.themTu("Banana", nghia2);
        tuDien.hienThi();
        System.out.println("------------------------------");
        tuDien.hienThi("Apple");
    }
}
