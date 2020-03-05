package ChapterTwoProgExercises;

import java.util.Scanner;

public class convertFeetToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter feet, e.g. 34.7 ft: ");
		double feet = input.nextDouble();
		
		double meters = feet * 0.305;
		System.out.println("The area of the cylinder is: " + meters +  " meters.");
				
	}

}
