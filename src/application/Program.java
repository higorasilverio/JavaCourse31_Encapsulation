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
		char initialDeposit = scanner.next().charAt(0);
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit: ");
			double amount = scanner.nextDouble();
			acc = new Account(number, holder, amount);
		}
		else {
			acc = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = scanner.nextDouble();
		acc.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = scanner.nextDouble();
		acc.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		scanner.close();
	}

}
