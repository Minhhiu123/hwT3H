package Lec4;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number for the array: ");
            arr[i] = sc.nextInt();
        }

        // Hiển thị các số người dùng nhập
        System.out.println("The elements of the array are: ");
        for (int j = 0; j < n; j++) {
            System.out.println((j + 1) + ": " + arr[j]);
        }

        // Tính tổng các số
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        System.out.println("The total is " + total);

        // Tìm số lớn nhất
        int theBiggest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > theBiggest) {
                theBiggest = arr[i];
            }
        }
        System.out.println("The biggest number is " + theBiggest);

        // Tìm số nhỏ nhất
        int smallestNumber = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallestNumber) {
                smallestNumber = arr[i];
            }
        }
        System.out.println("The smallest number is " + smallestNumber);

        sc.close();
    }
}
