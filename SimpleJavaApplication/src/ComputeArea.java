import java.util.Scanner;// Scanner is in the Java.Util Package
public class ComputeArea {

	public static void main(String[] args) {
		// create a new Scanner object
		Scanner input = new Scanner(System.in);
		// Prompt user to input a number for the radius
		System.out.print("Enter the radius: ");
		
		double radius = input.nextDouble();
		
		// compute the area
		
		double area = radius * radius * 3.14159;
		
		// display the results
		
		System.out.println("The area of the circle radius " + radius  + " is " + area + " "
				+ ""
				+ "square meters");
	}

}
