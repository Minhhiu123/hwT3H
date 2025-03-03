package Lec3;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int z=0; z <= 200000 / 5000 ; z++){
            for (int y=0;y <= (200000-5000*z)/2000; y++){
                if((200000 - (y * 2000 + z * 5000))%1000 == 0){
                    int x = (200000 - (y * 2000 + z * 5000))/1000;
                    System.out.println("(x1 = " + x + ", x2 = " + y + ", x3 = " + z + ")");
                }
            }
        }

    }
}
