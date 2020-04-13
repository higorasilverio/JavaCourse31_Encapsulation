package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = scanner.nextInt();
		System.out.print("Enter account holder: ");
		scanner.nextLine();
		String holder = scanner.nextLine();
		System.out.print("Enter initial deposit (y/n)? ");
		char initialDeposit = scanner.nextLine().charAt(0);
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit: ");
			double amount = scanner.nextDouble();
			System.out.println();
			
			acc = new Account(number, holder, amount);
			System.out.println("Account data:");
			System.out.println(acc.toString());
		}
		else {
			System.out.println();
			
			acc = new Account(number, holder);
			System.out.println("Account data:");
			System.out.println(acc.toString());
		}
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		acc.deposit(scanner.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(acc.toString());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		acc.withdraw(scanner.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(acc.toString());
		System.out.println();
		
		scanner.close();
	}

}
