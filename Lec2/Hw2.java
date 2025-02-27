package Lec2;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first edge: ");
        double a = sc.nextDouble();
        System.out.println("Enter the length of the second edge: ");
        double b = sc.nextDouble();
        System.out.println("Enter the length of the last edge: ");
        double c = sc.nextDouble();
        classifyTriangle(a, b, c);
    }
    public static void classifyTriangle(double a, double b, double c) {
        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("Khong phai tam giac");
        }
        else{
            if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a)){
                if(a==b||a==c||b==c){
                    System.out.println("tam giac vuong can");
                }
                else {
                    System.out.println("tam giac vuong");
                }
            } else if (a==b&&a==c) {
                System.out.println("tam giac deu");
            } else if (a==b||a==c||b==c) {
                System.out.println("tam giac can");
            }
            else {
                System.out.println("tam giac thuong");
            }
        }
    }
}
