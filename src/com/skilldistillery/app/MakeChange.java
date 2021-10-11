package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {

		Scanner cash = new Scanner(System.in);

		double amountDue, cashGiven, changeDue;
		
		//user enters correct amount including decimals

		System.out.println("Please enter the total amount due: ");
		amountDue = cash.nextDouble();
		System.out.println("Please enter the amount of cash given: ");
		cashGiven = cash.nextDouble();
		cash.nextLine();

		changeDue = cashGiven - amountDue;
		
		if (cashGiven < amountDue) {
			System.out.println("The customer did not provide enough money. Please ask for more");
			cash.nextLine();

		} else if (cashGiven == amountDue) {
			System.out.println("The customer gave exact amount due. No change needed.");
		}
		else {
		
		System.out.printf("The change due is $%.2f", changeDue);
		System.out.println("\n\nPlease give the customer: ");
		
		cash.close();

			
		//everything below is included in else statement
		
	
		
			int twentyDollar = (int) (changeDue / 20) ;
			int tenDollar = (int) (changeDue % 20 / 10);
			int fiveDollar = (int) (changeDue % 20 % 10 / 5);
			int oneDollar = (int) (changeDue % 20 % 10 % 5);
			
				if (changeDue > 20 && changeDue <= 100) {
	
					System.out.println(twentyDollar + " twenty dollar bills");
					changeDue = twentyDollar * 20;
				}
				if (changeDue >= 20 && changeDue < 40) {
	
					System.out.println(twentyDollar + " dollar bill");
					changeDue -= twentyDollar * 20;
				}
				if (changeDue >= 10 && changeDue < 20) {
				
					System.out.println("1 ten dollar bill");
					changeDue -= tenDollar * 10;
				}
				if (changeDue >= 5 && changeDue < 10) {
					
					System.out.println("1 five dollar bill");
					changeDue -= fiveDollar * 5;	
				}
				if (changeDue < 2 && changeDue > .99) {
					
					System.out.println("1 one dollar bill");
					changeDue -= 1;
				}
				if (changeDue >= 2 && changeDue < 5) {
	
					System.out.println(oneDollar + " one dollar bills");
					changeDue = changeDue % oneDollar;
				}
	
			
			int quarters = (int) (changeDue / .25) ;
			int dimes = (int) (changeDue % .25 / .10);
			int nickels = (int) (changeDue % .25 % .10 / .05);
			int pennies = (int) (changeDue % .25 % .10 % .05 / .01 + 1);
			
				if (changeDue > .50 && changeDue < 1) {

					System.out.println(quarters + " quarters");
					changeDue -= changeDue % quarters * 100;
				}
				if (changeDue >= .25 && changeDue < .50) {

					System.out.println(quarters + " quarter");
					changeDue -= .25;
				}
				if (changeDue >= .20 && changeDue < .30) {
				
					System.out.println(dimes + " dimes");
					changeDue -= changeDue % dimes * 100;
				}
				if	(changeDue >= .10 && changeDue < .20) {
				
					System.out.println(dimes + " dime");
					changeDue -= .10;
				}
				if (changeDue > .04 && changeDue < .10) {
					
					System.out.println(nickels + " nickel");
					changeDue -= .05;	
				}
				if (changeDue < .02) {
					
					System.out.println("1 penny");
				}
				if (changeDue >= .02 && changeDue < .05) {

					System.out.println(pennies + " pennies");
			
				}
								
			}
		}
	}


//	Amount: .67, Tendered: .50, Result: Error message
//	Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//	Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//	Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//	Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
