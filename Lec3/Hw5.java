package Lec3;

import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int x = sc.nextInt();
        int oriNumber = x;
        sc.close();

        String result = "";

        while (x != 0) {
            int soDu = x % 2;
            x = x / 2;
            result = soDu + result;
        }

        if (result.isEmpty()) {
            result = "0";
        }

        System.out.println("The binary of " + oriNumber + " is " + result);
    }
}
