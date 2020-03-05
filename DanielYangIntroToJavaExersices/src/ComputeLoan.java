import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//Enter annual interest in percentage e.g. 7.25%
		System.out.println("Enter annual interest in percentage e.g. 7.25%: ");
		
		double annualInterestRate = input.nextDouble();
		
		//Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.println(monthlyInterestRate);
		
		//Enter number of years
		System.out.println("Enter number of years as an integer e.g. 5: ");
		int numberOfYears = input.nextInt();
		
		//Enter loan amount
		System.out.println("Enter loan amount, e.g., 120000: ");
		double loanAmount = input.nextDouble();
		
		//Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println(monthlyPayment);
		//Display the result
		System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
	}

}
