package FinalTestMod1.Part3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = sc.nextLine();
        //Tao chuoi dao nguoc
        StringBuilder reversedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            reversedString.insert(0, input.charAt(i));
        }
        //So sanh
        if (input.equals(reversedString.toString())) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }
    }

}
