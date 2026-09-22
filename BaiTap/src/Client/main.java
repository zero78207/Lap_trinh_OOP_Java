package Client;
import Entities.*;
public class main {
    public static void main(String[] args) {
        BacSi bs1 = new BacSi("01", "Nguyen Van A", "Nam", "Tai Mui Hong", 3000000f);
        YTa yt2 = new YTa("02", "Nguyen Thi B", "Nu", "Cap cuu", 300000f);
        bs1.hienThi();
        yt2.hienThi();
    }
}