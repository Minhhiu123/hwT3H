package Lec2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu dai:");
        double a=sc.nextDouble();
        System.out.println("Nhap chieu rong");
        double b=sc.nextDouble();
        tinhDienTich(a,b);
        }
        public static void tinhDienTich(double x, double y){
            System.out.println("Dien tich: "+(x*y));
        }
    }

