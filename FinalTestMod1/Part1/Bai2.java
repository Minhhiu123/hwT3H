package FinalTestMod1.Part1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        int area = (int) (Math.PI * r * r); //Lam tron dien tich
        if (area % 2 == 0) {
            System.out.println("The area of the circle is :" + area + " (Even number)");
        }
        else {
            System.out.println("The area of the circle is :" + area + " (Odd number)");
        }

    }
}
