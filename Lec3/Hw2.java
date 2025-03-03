package Lec3;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int x = sc.nextInt();
        int firstNum=x;
        int reverseNumber=0;
        while (x>0){
            int lastNum=x % 10;
            reverseNumber=reverseNumber*10+lastNum;
            x = x / 10;
        }
        System.out.println("The reverse number of " + firstNum + " is " + reverseNumber);
    }
}
