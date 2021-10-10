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

		if (cashGiven < amountDue) {
			System.out.println("The customer did not provide enough money. Please ask for ");
			cash.nextLine();

		} else if (cashGiven == amountDue) {
			System.out.println("The customer gave exact amount due. No change needed.");
		}

		// while (cashGiven > changeDue) {

		System.out.printf("The change due is $%.2f", changeDue);

		if (changeDue > 0) {
			// if (changeDue % .25 > 0 || changeDue % .25 < 4) {

			int quarters = (int) (changeDue / .25);

			if (changeDue % .25 <= 1) {

				System.out.println("\nPlease give the customer " + quarters + " quarter");
			}
			else if (changeDue % .25 <= 4 && changeDue > 1) {

				System.out.println("\nPlease give the customer " + quarters + " quarters");
			}
			if (changeDue % .10 > 0 || changeDue % .10 < 10) {

				int dimes = (int) (changeDue / .10);
				System.out.println("\nPlease give the customer " + dimes + " dimes");
			}

			if (changeDue % .05 > 0 || changeDue % .05 <= 2) {

				int nickles = (int) (changeDue / .05);
				System.out.println("\nPlease give the customer " + nickles + " nickles");

			}
			if (changeDue % .01 > 0 || changeDue % .01 <= 4) {

				int pennies = (int) (changeDue / .01 + 1);
				System.out.println("\nPlease give the customer " + pennies + " pennies");
				// break;
			}
		}
	}
}

//	Amount: .67, Tendered: .50, Result: Error message
//	Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//	Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//	Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//	Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
