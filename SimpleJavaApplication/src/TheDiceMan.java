
public class TheDiceMan {

	public static void main(String[] args) {
		// "throw the die"
		double randomNumber = Math.random();
		randomNumber *= 6;
		randomNumber++;
		int dieValue = (int)randomNumber;
		// the die value is used to display an instruction (slightly
		// modified version of the Dice Man's first throw of the
		// die!)
		switch (dieValue)
		{
		case 1:
		System.out.println("forget the whole affair");
		break;
		case 2:
		System.out.println
		("wait until the party on Saturday");
		break;
		case 3:
		System.out.println("do what Arlene says");
		break;
		case 4:
		System.out.println("have a platonic relationship");
		break;
		case 5:
		System.out.println("follow your emotions");
		break;
		case 6:
		System.out.println
		("go to Arlene’s apartment tonight");
		break;
		}
		
	}

}
