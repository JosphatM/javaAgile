package Lab1;

import java.util.Scanner;

public class FuelConsumption {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// enter fill cost
		
		System.out.println("Please enter the fill cost for your car: ");
		
		double fillCost = input.nextDouble();
		
		// Enter fill rate
		
		System.out.println("Please enter the fill rate for the fuel: ");
		
		double fillRate = input.nextDouble();
		
		// Enter distance traveled
		
		System.out.println("Please enter the distance travelled: ");
				
		double kilometres = input.nextDouble();
		
		
		double litresOfFuel = fillCost / fillRate;
	
		double fuelConsumptionPerKilometre = kilometres / litresOfFuel;
		
		System.out.println("Fule consumption per kilometre is: " + fuelConsumptionPerKilometre + " litres per Kilometre.");

	}

}
