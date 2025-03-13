package FinalTestMod1.Part3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = sc.nextLine();
        StringBuilder reversedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            reversedString.insert(0, input.charAt(i));
        }
        System.out.println("Chuỗi đảo ngược: " + reversedString);
    }
}
