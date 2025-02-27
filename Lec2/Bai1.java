package Lec2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your date of birth: ");
        String dateOB=sc.nextLine();
        System.out.println("Enter your address: ");
        String address=sc.nextLine();
        System.out.println("Enter your School: ");
        String school=sc.nextLine();
        System.out.println("Xin chao "+ name+" đến từ " + address+", sinh ngày " +dateOB +", trường " +school);
    }

}
