package Lec2;
import java.sql.SQLOutput;
import java.util.*;

public class Hw1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem chuyen can: ");
        int x=sc.nextInt();
        System.out.println("Nhap diem giua ky: ");
        int y=sc.nextInt();
        System.out.println("Nhap diem cuoi ky: ");
        int z=sc.nextInt();
        tinhDiemSinhVien(x,y,z);
    }
    public static void tinhDiemSinhVien(int a, int b, int c){
        double finalScore=  (a + b + c) /3;
        System.out.println("Diem tong ket: "+finalScore);
        if(finalScore>=9){
            System.out.println("Loai=A");
        }
        else if(finalScore>=7){
            System.out.println("Loai=B");
        }
        else if(finalScore>=5){
            System.out.println("Loai=C");
        }
        else {
            System.out.println("Loai=D");
        }
    }
}
