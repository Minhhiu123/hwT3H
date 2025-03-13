package FinalTestMod1.Part4;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhap vao so luong phan tu mang
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        //Nhap vao phan tu mang
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        //Tim gia tri lon nhat va nho nhat
        System.out.println("Gia tri lon nhat cua mang la: "+maxNum(arr));
        System.out.println("Gia tri nho nhat cua mang la: "+minNum(arr));

        //Tong ca phan tu
        System.out.println("Tong ca phan tu cua mang la: "+sum(arr));

        //Them phan tu
        int[] newArr=insertElement(arr);
        System.out.println("Mang sau khi them: " + Arrays.toString(newArr));

        //xoa phan tu
        int[] newArr2=deleteElement(arr);
        System.out.println("Mang sau khi xoa: " + Arrays.toString(newArr2));

        //Tim phan tu lon thu 3
        System.out.println();
        System.out.println("Gia trị lon thu 3 trong mang ban dau la: " + thirdLarElement(arr));

    }
    public static int maxNum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minNum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int[] insertElement(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vi tri ban muon them: ");
        int index= sc.nextInt();
        System.out.println("Nhap gia tri them: ");
        int value=sc.nextInt();
        int n = arr.length;

        if (index < 0 || index > n) {
            System.out.println("Vi tri khong hop le");
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
        System.out.print("Nhap gia trị muon xoa: ");
        int removeElement = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == removeElement) count++;
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != removeElement) {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
    public static int thirdLarElement(int[] arr){
        //Bubble sort để sắp xếp mảng
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int a=1;
        int giaTriGan=arr[arr.length-1];
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] != giaTriGan) {
                a+=1;
                giaTriGan=arr[i];
            }
            if (a==3) break;
        }
        return giaTriGan;
    }

}
