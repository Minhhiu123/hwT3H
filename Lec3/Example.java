package Lec3;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tongSoNguyenAm=0;
        double tongSoNguyenDuong=0;
        int soNguyenAm=0;
        int soNguyenDuong=0;
        for (int i=1; i<11; i++) {
            System.out.println("Nhap so nguyen thu "+ i);
            double x = sc.nextDouble();
            if (x<0){
                soNguyenAm +=1;
                tongSoNguyenAm=tongSoNguyenAm+x;
            }
            else {
                soNguyenDuong +=1;
                tongSoNguyenDuong=tongSoNguyenDuong+x;
            }
        }
        System.out.println("So luong so nguyen am: "+soNguyenAm);
        System.out.println("So luong so nguyen duong: " + soNguyenDuong);
        System.out.println("Tong cac so nguyen am: " + tongSoNguyenAm);
        System.out.println("Tong cac so nguyen duong: " + tongSoNguyenDuong);

    }
}
