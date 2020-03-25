
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		int[] justNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
		
		
		for(int i = 0; i < justNumbers.length; i++){
			
			
			System.out.println("The numbers are: " + justNumbers[i]);
			
			System.out.println("Finally got the hang of it. YAYNESS!!! ");
						
		}
		int counter = justNumbers.length - 1;
		while (counter>=0) {
			System.out.println(justNumbers[counter]);
			counter--;
		}
	}

}
