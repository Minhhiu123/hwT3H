package FinalTestMod1.Part1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int x = sc.nextInt();
        System.out.println("Enter the second integer: ");
        int y = sc.nextInt();
        System.out.println("The total of two integers is : " + totalInteger(x, y));
    }
    public static double totalInteger(int x, int y) {
        int result = x+y;
        return result;
    }
}
