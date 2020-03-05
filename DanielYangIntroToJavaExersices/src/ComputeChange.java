import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		//receive amount
		System.out.println("Enter the amount in double, for example 11.56: ");
		
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		
		//Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		int remaininAmount = remainingAmount % 100;
		
		//Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//Find the numberOfDimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//Find the number of nickles in the remaining amount
		int numberOfNickles = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		//Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		//Display results
		
		System.out.println("Your amount " + amount + "consist of");
		System.out.println("   " + numberOfOneDollars + " Dollars");
		System.out.println("   " + numberOfQuarters + " Quarters");
		System.out.println("   " + numberOfDimes + " Dimes");
		System.out.println("   " + numberOfNickles + " Nickles");
		System.out.println("   " + numberOfPennies + " Pennies");
	}

}
