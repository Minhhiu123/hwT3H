package Lec3;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        System.out.println("Enter an positive integer: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<0){
            System.out.println("invalid input");
        }
        else System.out.println(x + "! = " + timGiaiThua(x));
    }
    public static int timGiaiThua(int x){
        if(x == 1){
            return 1;
        }
        else return x * timGiaiThua(x-1);
    }

}
