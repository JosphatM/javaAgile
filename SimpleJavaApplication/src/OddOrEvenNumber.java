
public class OddOrEvenNumber {

	public static void main(String[] args) {
		//Generate a random number
		
		double randomNumber= Math.random();
		
		randomNumber *=10;
		randomNumber++;
		
		if(randomNumber %2 ==0) {
			System.out.println("the number is Even");
		}
		else if (randomNumber %2 !=0){
			System.out.println("The number is Odd");
		}
	}

}
