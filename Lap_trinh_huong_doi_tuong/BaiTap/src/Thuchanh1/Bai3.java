package Thuchanh1;

public class Bai3 {
    public static void main(String[] args){
        System.out.println("Nhap so luong phan tu: ");
        int n = Input.inputInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            a[i] = Input.inputInt();
        }int dem1 = 0, dem2 = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                dem1++;
            }else{
                dem2++;
            }
        }
        System.out.println("So luong phan tu chan: " + dem1);
        System.out.println("So luong phan tu le: " + dem2);
    }
}
