package Lec4;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phone number: ");
        String phoneNum = sc.nextLine();

        // Kiểm tra số có bắt đầu bằng 0, +84 hoặc 84 không
        boolean f = phoneNum.startsWith("0") || phoneNum.startsWith("+84") || phoneNum.startsWith("84");
        if (!f) {
            System.out.println("Invalid phone number");
            return;
        }

        // Kiểm tra ký tự không hợp lệ
        for (int i = 0; i < phoneNum.length(); i++) {
            char ch = phoneNum.charAt(i);
            if (!Character.isDigit(ch) && ch != '.' && ch != '-') {
                System.out.println("Invalid phone number");
                return;
            }
        }
        phoneNum = phoneNum.replaceAll("[.-]", "");
        phoneNum = phoneNum.replaceFirst("^\\+?84|^0", "");
        if (phoneNum.length() != 9) {
            System.out.println("Invalid phone number");
        } else {
            System.out.println("Valid phone number");
        }
    }
}
