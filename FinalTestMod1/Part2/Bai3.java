package FinalTestMod1.Part2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số chuyến đi: ");
        int x = sc.nextInt();
        if(x<0){
            System.out.println("Số chuyến không hợp lệ!");
        }
        else {
            System.out.println("Số tiền phải trả là: " + totalPrice(x));
        }
    }
    public static int totalPrice(int x){
        int total=x * 10000;
        if(x>5){
            total= (int) (total*0.9);
        }
        else if(x>10){
            total= (int) (total*0.8);
        }
        return total;
    }
}
