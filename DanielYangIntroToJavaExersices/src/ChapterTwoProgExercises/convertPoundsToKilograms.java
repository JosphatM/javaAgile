package ChapterTwoProgExercises;

import java.util.Scanner;

public class convertPoundsToKilograms {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter pounds , e.g. 34.7 lb: ");
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.454;
		System.out.println("The amount of kilos in " + pounds + " is: " + kilograms +  " kilograms.");

	}

}
