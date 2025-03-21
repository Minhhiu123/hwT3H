package Lec7.Bai4;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000, 4.5);
        acc.withdraw(2500);
        acc.deposit(3000);

        System.out.println("Current Balance: " + acc.getBalance());
        System.out.println("Monthly Interest: " + acc.getMonthlyInterest());
        System.out.println("Account Created on: " + acc.getDateCreated());
    }
}
