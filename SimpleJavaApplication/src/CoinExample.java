
public class CoinExample {

	public static void main(String[] args) {
		
		// generate a random number in the range >=0.0 and <1.0
		double randomNumber = Math.random();
		// use the random number in an 'if' statement to
		// display the face of the coin
		if (randomNumber < 0.5)
		{
		System.out.println("The coin shows heads");
		}
		else
		{
		System.out.println("The coin shows tails");
		}
		
		
	}

}
