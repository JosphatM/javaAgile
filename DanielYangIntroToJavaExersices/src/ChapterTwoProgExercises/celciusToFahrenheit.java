package ChapterTwoProgExercises;

import java.util.Scanner;

public class celciusToFahrenheit {

	public static void main(String[] args) {
		//Create new Scanner
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please put the amount in double , e.g. 34.7 celcius: ");
		
		double celsius = input.nextDouble();
		
		// convert celcius into Fahrenheit
		
		double fahrenheit = (9/5.0) * celsius + 32;
		
		System.out.println(celsius + "Celsius is " + fahrenheit + "Fahrenheit. Thank you:-)");
		
		
		
		
	}

}
