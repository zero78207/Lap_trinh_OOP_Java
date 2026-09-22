package Thuchanh1;

public class Bai5 {
    public static void main(String[] args){
        System.out.println("Nhap so luong phan tu: ");
        int n = Input.inputInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + (i + 1) +": ");
            a[i] = Input.inputInt();
        }int Max = a[0];
        for(int i = 1; i < n; i++){
            if(Max < a[i]){
                Max = a[i];
            }
        }int Min = a[0];
        for(int i = 1; i < n; i++){
            if(Min > a[i]){
                Min = a[i];
            }
        }System.out.println("Gia tri lon nhat trong mang: " + Max);
        System.out.println("Gia tri be nhat trong mang: " + Min);
    }
}
