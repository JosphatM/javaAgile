import java.util.Random;
public class Die {
	//method
	public int roll()
	  {
		Random randomNumberGenerator = new Random();
		int randomNumber = randomNumberGenerator.nextInt(6) + 1;
		return randomNumber;
	  }	
}
