#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>
#include <utility>
using namespace std;

void siftDown(int arr[], int i, int n){
    int maxIndex = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    if (left < n && arr[left] > arr[maxIndex])
        maxIndex = left;
    if (right < n && arr[right] > arr[maxIndex])
        maxIndex = right;
    if (i != maxIndex)
    {
        swap(arr[i], arr[maxIndex]);
        siftDown(arr, maxIndex, n);
    }
}

void heapSort(int arr[], int n){
    for (int i = n / 2 - 1; i >= 0; i--)
        siftDown(arr, i, n);
    for (int i = n - 1; i >= 0; i--)
    {
        swap(arr[0], arr[i]);
        siftDown(arr, 0, i);
    }
}

void randomArr(int a[], int n){
    int i;
    for (i = 0; i < n; i++)
        a[i] = rand();
}

bool isSorted(int a[], int n){
    for (int i = 0; i + 1 < n; i++)
        if (a[i] > a[i + 1])
            return false;
    return true;
}

struct SinhVien
{
    string hoTen;
    float diemTB;
};

void siftDownSV(SinhVien a[], int i, int n)
{
    int minIndex = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    if (left < n && a[left].diemTB < a[minIndex].diemTB)
        minIndex = left;
    if (right < n && a[right].diemTB < a[minIndex].diemTB)
        minIndex = right;
    if (i != minIndex)
    {
        swap(a[i], a[minIndex]);
        siftDownSV(a, minIndex, n);
    }
}

void heapSortSV(SinhVien a[], int n)
{
    for (int i = n / 2 - 1; i >= 0; i--)
        siftDownSV(a, i, n);
    for (int i = n - 1; i >= 0; i--)
    {
        swap(a[0], a[i]);
        siftDownSV(a, 0, i);
    }
}

void inDanhSach(SinhVien a[], int n){
    for (int i = 0; i < n; i++)
        cout << i + 1 << ". " << a[i].hoTen << " - " << a[i].diemTB << endl;
}

int main(){
    int arr[1000], n = 1000;
    srand(time(NULL));
    randomArr(arr, n);
    heapSort(arr, n);
    cout << "Sorted array is \n";
    for (int i = 0; i < n; ++i)
        cout << arr[i] << " ";
    cout << endl;
    cout << (isSorted(arr, n) ? "=> Mang da duoc sap xep tang dan." : "=> LOI: mang chua sap xep!") << endl;

    SinhVien ds[] = {
        {"Nguyen Van An", 7.5f},
        {"Tran Thi Binh", 8.9f},
        {"Le Van Cuong", 6.2f},
        {"Pham Thi Dung", 9.1f},
        {"Hoang Van Em", 5.8f},
        {"Vu Thi Hoa", 8.9f},
        {"Dang Van Khoa", 7.0f}};
    int m = sizeof(ds) / sizeof(ds[0]);

    cout << "\nDanh sach sinh vien truoc khi sap xep:" << endl;
    inDanhSach(ds, m);

    heapSortSV(ds, m);

    cout << "\nDanh sach sinh vien sau khi sap xep giam dan theo diem TB:" << endl;
    inDanhSach(ds, m);

    return 0;
}
