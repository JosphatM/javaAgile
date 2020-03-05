
public class PrintATable {
	
	public static void main(String[] args) {

		
		// Print Table Header
		System.out.println("a "  + "a^2 "  + "a^3");
		
		// Use loop to calculate the square and cube of numbers 1-4
		
		for (int a = 1; a <= 4; a++) {
			//Calculation
			
			double square = Math.pow(a,2);
			double  cube = Math.pow(a,3);
			
			System.out.println(a + " " + square + " " + cube);
		}
	}

}

