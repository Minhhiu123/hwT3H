package Lec2;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the electric number: ");
        int eNum=sc.nextInt();

    }

    public static void eCost(int a){
        int finalCost;
        if(a<=50){
           finalCost = a*1678;
        } else if (a>50 && a<=100) {
            finalCost = 50*1678 + (a-50)*1734;
        } else if (a>100 && a<=200) {
            finalCost = 50*1678 + 50*1734 + (a-100)*2014;
        }
        else if (a>200 && a<=300) {
            finalCost = 50*1678 + 50*1734 + 100*2014 + (a-200)*2536;
        } else if (a>300 && a<=400) {
            finalCost = 50*1678 + 50*1734 + 100*2014 + 100*2536 + (a-300)*2834;
        }
        else {
            finalCost = 50*1678 + 50*1734 + 100*2014 + 100*2536 + 100*2834 + (a-400)*2927;
        }
        System.out.println("Your electricity bill is: "+finalCost);
    }
}
