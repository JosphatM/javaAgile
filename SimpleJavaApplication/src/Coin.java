import java.util.Random;

/**
 * 
 * @author jmmur
 *	Exercise 6.5
 */
public class Coin {

	
	String toss1= "Heads";
	String toss2= "Tails";
	
	public double getFace()
	  {
		
		double randomNumber = Math.random();
		
		/**
		if (randomNumber < 0.5)
		{
			System.out.println(toss1);
		}
		else
		{
			System.out.println(toss2);
		}
		*/
		return randomNumber;
	  }	
}
