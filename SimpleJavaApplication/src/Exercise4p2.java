
public class Exercise4p2 {

	public static void main(String[] args) {
		double randomNumber = Math.random();
		
		randomNumber *=13;
		randomNumber++;
		
		int diceThrow = (int)randomNumber;
		
		switch(diceThrow){
		case 11:
			System.out.println
			("Jack");
			break;
			case 12:
			System.out.println
			("Queen");
			break;
			case 13:
			System.out.println
			("King");
			break;
		default:
			System.out.println("The card number is: " + diceThrow);
		}
	}

}
