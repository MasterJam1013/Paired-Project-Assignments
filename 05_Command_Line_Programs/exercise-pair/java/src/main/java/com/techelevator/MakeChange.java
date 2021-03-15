package com.techelevator;
import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {



	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.print( "Please enter total bill: ");
		String billAmount = inputData.nextLine();
		double totalBill = Double.parseDouble(billAmount);


		System.out.print( "Please enter amount tendered: ");
		String amountTendered = inputData.nextLine();
		double totalTendered = Double.parseDouble(amountTendered);

		double changeRecieved = totalTendered - totalBill;
		System.out.format( " The total change required is: $%.2f\n", changeRecieved);



	}

}
