package OOP_Java.Account;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        String number = sc.nextLine();
        System.out.println("Enter the account balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(number, balance);
        System.out.println(account);
        System.out.println("Do you want to reset the balance? (y/n)");
        char user = sc.next().charAt(0);
        if (user == 'y' || user == 'Y') {
            account.resetBalance();
            System.out.println("Balance reset successfully.");
            System.out.println(account);
        } else {
            System.out.println("Balance not reset.");
            System.out.println(account);
        }

    }

}
