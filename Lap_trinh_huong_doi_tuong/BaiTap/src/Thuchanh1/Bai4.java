package Thuchanh1;

public class Bai4 {
    public static void main(String[] args){
        System.out.println("Nhap so luong phan tu: ");
        int n = Input.inputInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + (i + 1) +": ");
            a[i] = Input.inputInt();
        }for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }for(int i = 0; i < n; i++){
            System.out.println(a[i] + " ");
        }
    }
}
