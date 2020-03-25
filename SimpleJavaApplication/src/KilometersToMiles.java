
public class KilometersToMiles {

	public static void main(String[] args) {
		//Creating an array of double type
		
		double [] multipliers = new double [2];
		
		multipliers [0] = 0.62;
		multipliers [1] = 0.54;
		
		int [] kilometresTravelled = new int[3];
		
		kilometresTravelled[0] = 2;
		kilometresTravelled[1] = 5;
		kilometresTravelled[2] = 10;
		
		double milesTravelled = multipliers[0] * kilometresTravelled.length;
		double nauticalMilesTravelled = multipliers[1] * kilometresTravelled.length;
		
		System.out.println("Amount of miles travelled compared to the kilometresTravelled is: " + milesTravelled );
	}
}