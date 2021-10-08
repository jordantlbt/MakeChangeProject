package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		
		Scanner cash = new Scanner(System.in);
		
		
		double amountDue, cashGiven, changeDue;
		System.out.println("Please enter the total amount due: ");
		amountDue = cash.nextDouble();
		System.out.println("Please enter the amount of cash given: ");
		cashGiven = cash.nextDouble();
		cash.nextLine();
		
		changeDue = cashGiven - amountDue;
		
		int pennies, nickles, dimes, quarters, dollars;
		
		
		
		
		if(cashGiven < amountDue) {
			System.out.println("The customer did not provide enough money. Please ask for ");
			cash.nextLine();
			
		}
		else if(cashGiven == amountDue) {
			System.out.println("The customer gave exact amount due. No change needed.");
		}
		else{
		
			
			
		System.out.printf("The change due is $%.2f", changeDue );
		System.out.println();
		}
		
		
		
	}

	
//	Amount: .67, Tendered: .50, Result: Error message
//	Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//	Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//	Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//	Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
}