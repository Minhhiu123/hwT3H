package Lec3;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        double result=0;
        System.out.println("Enter a number: ");
        do {
            x = sc.nextInt();
            if (x < 0) {
                System.out.println("Enter a positive number");
            } else {
                for (int i = 1; i <= x; i++) {
                   result=  (result + Math.pow(x, 3));
                }
            }
        } while (x < 0);
        System.out.println("S(n) = " + result);
    }
}