
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		int[] justNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
		//Create and initialize an array containing the integers 1, 2, 3, 4, 5, 6, 7, 8, 9, and
		//10.
								
				
		//Use a “for” loop to print out the contents of the array.
		for(int i = 0; i < justNumbers.length; i++){
				System.out.println("The numbers are: " + justNumbers[i]);
			}
				//Add a “while” loop that prints out the contents of the array in reverse order.
		int counter = justNumbers.length - 1;
				while (counter>=0) {
					System.out.println(justNumbers[counter]);
					counter--;
			}
				//Add a “do…while” loop that iterates forward through the array. Inside the
				//loop, add an “if” statement so that only even numbered values from the array
				//are printed.
						
				
		int i = 0;
				do {
			
					if(justNumbers[i] %2 == 0) {
						System.out.println("The even numbers in the loop are: " + justNumbers[i]);
						
						}i++;
				}while (i<justNumbers.length);
			
	}		
}