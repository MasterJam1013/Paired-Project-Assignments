package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {

		Scanner weightInput = new Scanner(System.in);

		System.out.print( "Please enter Earth weights in lbs (seperated by a space): ");
		String earthWeights = weightInput.nextLine();
		String[] weightsArray = earthWeights.split( " ");


		for (int i =0; i<weightsArray.length; i++){
			int weightCal = Integer.parseInt(weightsArray[i]) ;
			int marsWeight = 0;
			marsWeight = (int) (weightCal * 0.378);
			System.out.println(weightCal + " lbs. on Earth, is " + marsWeight + " lbs. on Mars.");
		}

	}

}
