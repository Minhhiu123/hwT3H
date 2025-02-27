package Lec2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a=sc.nextDouble();
        System.out.println("Enter the second number:");
        double b=sc.nextDouble();
        System.out.println("1, Tong: "+ (a+b));
        System.out.println("2, Tich: "+ (a*b));
        System.out.println("3, Thuong: "+ (a/b));
        System.out.println("4, So du cua thuong: "+ (a%b));
    }
}
