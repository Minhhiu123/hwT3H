package Lec4;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array!");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //1, Nhap gia tri cho mang
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value for the array: ");
            arr[i] = sc.nextInt();
        }

        //2,Tinh tong cac phan tu chan, le
        int result1=totalEvenValue(arr);
        System.out.println("The total of even number in the array is: " + result1);
        int result2=totalOddValue(arr);
        System.out.println("The total of odd number in the array is: " + result2);

        //3, In ra cac so nguyen to trong mang
        System.out.print("The prime numbers in the array are: ");
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }

        //4, Sap xep mang
        System.out.println("Arranged array: ");
        arrangeValue(arr);

        //5, Chia mang
        System.out.println("Splited array: ");
        splitArray(arr);

        //6

        //7, Them gia tri
        int[] newArr=insertElement(arr);
        System.out.println("New array: " + Arrays.toString(newArr));

        //8. Xoa
        System.out.println("New array: " + Arrays.toString(deleteElement(newArr)));
    }

    public static int totalEvenValue(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static int totalOddValue(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void arrangeValue(int[] arr){
        int n = arr.length;
        int evenCount = 0, oddCount = 0;
        // Đếm số lượng số chẵn và số lẻ
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        // Tạo mảng cho số chẵn và lẻ
        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];
        int evenIndex = 0, oddIndex = 0;
        // Phân loại số chẵn và số lẻ
        for (int i=0; i<n; i++) {
            if (arr[i] % 2 == 0) evenArr[evenIndex++] = arr[i];
            else oddArr[oddIndex++] = arr[i];
        }
        // Sắp xếp số chẵn giảm dần, số lẻ tăng dần
        Arrays.sort(evenArr);
        Arrays.sort(oddArr);

        // Đảo ngược mảng chẵn để giảm dần
        for (int i = 0; i < evenArr.length / 2; i++) {
            int temp = evenArr[i];
            evenArr[i] = evenArr[evenArr.length - 1 - i];
            evenArr[evenArr.length - 1 - i] = temp;
        }
        System.out.println("The odd array is: " + Arrays.toString(oddArr));
        System.out.println("The even array is: " + Arrays.toString(evenArr));
    }
    public static void splitArray(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / n;

        int count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= avg) count1++;
            else count2++;
        }

        int[] arr1 = new int[count1];
        int[] arr2 = new int[count2];

        int idex1 = 0, idex2 = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] <= avg) arr1[idex1++] = arr[j];
            else arr2[idex2++] = arr[j];
        }

        System.out.println("Array 1 (≤ average): " + Arrays.toString(arr1));
        System.out.println("Array 2 (> average): " + Arrays.toString(arr2));
    }
    public static int[] insertElement(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position you want to insert: ");
        int index= sc.nextInt();
        System.out.println("Enter the insert value: ");
        int value=sc.nextInt();
        int n = arr.length;

        if (index < 0 || index > n) {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[n + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index-1) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
    public static int[] deleteElement(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position you want to delete: ");
        int index = sc.nextInt();
        int n = arr.length;
        if (index < 0 || index >= n) {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i != index-1) {
                newArr[j++] = arr[i
                        ];
            }
        }
        return newArr;
    }
}
