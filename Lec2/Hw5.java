package Lec2;

import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year ");
        int year = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        printDaysInMonth(year, month);
    }

    public static void printDaysInMonth(int year, int month) {
        int days;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            if (isLeapYear(year)){
                days=29;
            }
          else{
                days=28;
            }

        } else {
            System.out.println("Invalid month");
            return;
        }

        System.out.println("Thang " + month + " nam " + year + " co " + days + " ngay.");
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
