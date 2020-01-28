package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		int number;
		String holder;
		double initialBalance, withdrawLimit;
		
		try {
			System.out.printf("Enter account data%n");
			System.out.printf("Number: ");
			number = sc.nextInt();
			sc.nextLine();
			System.out.printf("Holder: ");
			holder = sc.nextLine();
			System.out.printf("Initial balance: ");
			initialBalance = sc.nextDouble();
			System.out.printf("Withdraw limit: ");
			withdrawLimit = sc.nextDouble();
			account = new Account(number, holder, initialBalance, withdrawLimit);
			
			double amount;
			
			System.out.printf("%n");
			System.out.printf("Enter amount for withdraw: ");
			amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.printf("New balance: %.2f%n", account.getBalance());
		}
		catch (DomainException e) {
			System.out.printf("Withdraw error: %s%n", e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.printf("Unexpected error%n");
		}
		
		sc.close();

	}

}
