package August.ex_04082024_Constructor;

import java.util.Scanner;

public class Lab_170_BankAccount {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Name of the Bal!");
        int bal = sc.nextInt();
        System.out.println("Enter your Name of the Bank code!");

        String bCode = sc.next();

        BankAccount baicici = new BankAccount(bName, bal, bCode);


        baicici.printDetails();

        sc.close();

    }
}
