package ChapterTwoProgExercises;

import java.util.Scanner;

public class calculatingEnergy {

	public static void main(String[] args) {
		//Create new Scanner
		
				Scanner input = new Scanner(System.in);
				
				System.out.println("Please enter weight of water in kilograms, e.g. 34.7 kgs: ");
				
				double waterWeight = input.nextDouble();
				
				System.out.println("Please enter initial temperature of the water, e.g. 34.2 Celsius: ");
				
				double initialTemperature = input.nextDouble();
				
				System.out.println("Please enter final temperature of the water, e.g. 34.2 Celsius: ");
				
				double finalTemperature = input.nextDouble();
				
				double Energy =  waterWeight * (finalTemperature - initialTemperature) * 4184;
				
				System.out.println("The energy created in joules is: " + Energy +  " Joules.");
				

	}

}
