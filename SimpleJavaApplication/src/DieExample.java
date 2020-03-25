
public class DieExample {

	public static void main(String[] args) {
		
		// generate a random number in the range >=0.0 and <1.0
		
		double randomNumber = Math.random();
		
		// to get a number in the range 1 to 6, we need to
		
		// multiply the random number by 6 and add 1
		
		randomNumber *= 7;
		randomNumber++;
		
		// to convert this value into an integer we cast it
		
		int dieValue = (int)randomNumber;
		
		if(dieValue >= 1 && dieValue <= 6)
		{
		// OK message
			System.out.println("Okay!!!");
		}
		else
		{
		// error message
			System.out.println("Not Okay!!!!");
		}
		
		System.out.println(dieValue);
		
	}

}
