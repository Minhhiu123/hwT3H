package Lec2;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            showMenu();
            option=sc.nextInt();
            switch(option){
                case 1: tinhDiemSinhVien();
                    break;
                case 2: kiemTraLoaiTamGiac();
                break;
                case 3: tinhTienDien();
                break;
                case 4:
                    System.out.println("Da ket thuc");
            }
        } while (option!=4);
        sc.close();

    }
    public static void showMenu(){
        System.out.println("++++++++++++++ MENU ++++++++++++++");
        System.out.println("1. Tinh diem sinh vien");
        System.out.println("2. Kiem tra loai tam giac");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.print("Chon chuc nang: ");
    }

    public static void tinhDiemSinhVien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem chuyen can");
        int a=sc.nextInt();
        System.out.println("Nhap diem giua ky");
        int b=sc.nextInt();
        System.out.println("Nhap diem cuoi ky");
        int c=sc.nextInt();
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
    public static void kiemTraLoaiTamGiac() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai canh thu nhat");
        double a=sc.nextDouble();
        System.out.println("Nhap do dai canh thu hai");
        double b=sc.nextDouble();
        System.out.println("Nhap do dai canh thu ba");
        double c=sc.nextDouble();
        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("Khong phai tam giac");
        }
        else{
            if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a)){
                if(a==b||a==c||b==c){
                    System.out.println("tam giac vuong can");
                }
                else {
                    System.out.println("tam giac vuong");
                }
            } else if (a==b&&a==c) {
                System.out.println("tam giac deu");
            } else if (a==b||a==c||b==c) {
                System.out.println("tam giac can");
            }
            else {
                System.out.println("tam giac thuong");
            }
        }
    }
    public static void tinhTienDien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien");
        int a=sc.nextInt();
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


