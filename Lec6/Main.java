package Lec6;

public class Main {
    public static void main(String[] args) {
        PhanSo phanSo1 = new PhanSo(1,2);
        PhanSo phanSo2 = new PhanSo(3,4);
        PhanSo tong=phanSo1.cong(phanSo2);
        PhanSo tich=phanSo1.nhan(phanSo2);
        System.out.print("Tong: ");
        tong.hienThi();
        System.out.print("Tich: ");
        tich.hienThi();
        }
    }

