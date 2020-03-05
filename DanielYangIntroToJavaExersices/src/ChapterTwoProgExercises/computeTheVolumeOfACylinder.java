package ChapterTwoProgExercises;

import java.util.Scanner;

public class computeTheVolumeOfACylinder {

	public static void main(String[] args) {
	
		//Create new Scanner
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter radius, e.g. 34.7 CM: ");
		
		double radius = input.nextDouble();
		
		System.out.println("Please enter height, e.g. 34.7 CM: ");
		
		double length = input.nextDouble();
		
		double area = radius * radius * 3.14159;
		System.out.println("The area of the cylinder is: " + area +  " CM squared.");
		
		double volume = area * length;
		System.out.println("The volume of the cylinder is: " + volume +  " CM cubed.");
		
				
	}

}
