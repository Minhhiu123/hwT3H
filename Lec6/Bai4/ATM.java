package Lec6.Bai4;

import java.util.Scanner;

public class ATM {
    private static Account[] accounts = new Account[10];

    static {
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100, 0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập ID tài khoản (0-9): ");
            int accountId = scanner.nextInt();
            accountId = getValidAccountId(accountId);
            handleMenu(accounts[accountId]);
        }
    }

    private static int getValidAccountId(int id) {
        while (id < 0 || id >= 10) {
            System.out.println("ID không hợp lệ. Vui lòng nhập lại.");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập ID tài khoản (0-9): ");
            id = scanner.nextInt();
        }
        return id;
    }

    private static void handleMenu(Account account) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n----- Menu -----");
            System.out.println("1: Xem số dư");
            System.out.println("2: Rút tiền");
            System.out.println("3: Gửi tiền");
            System.out.println("4: Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Số dư hiện tại: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Nhập số tiền cần rút: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0) {
                        account.withdraw(withdrawAmount);
                        System.out.println("Số dư mới: $" + account.getBalance());
                    } else {
                        System.out.println("Số tiền không hợp lệ.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số tiền cần gửi: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        account.deposit(depositAmount);
                        System.out.println("Số dư mới: $" + account.getBalance());
                    } else {
                        System.out.println("Số tiền không hợp lệ.");
                    }
                    break;
                case 4:
                    System.out.println("Quay lại màn hình nhập ID...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
}
