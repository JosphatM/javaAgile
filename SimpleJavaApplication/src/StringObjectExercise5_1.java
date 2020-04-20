               
public class StringObjectExercise5_1 {
	//Create a class with a “main” method.
	
	public static void main(String[] args) {
		
		//In “main,” create a new String object that contains lowercase letters.
		String lowerCase = new String("miano");
		 
		System.out.println(lowerCase);
		
		//Create another String object that contains uppercase letters.
		
		String upperCase = new String("MIANO");
		
		System.out.println(upperCase);
		
		//Create a StringBuilder object that contains the first String converted to uppercase. 
		
		StringBuilder justBuilder = new StringBuilder(lowerCase.toUpperCase());
		
		System.out.println(justBuilder);
		
		// Append a lowercase version of the second String to the StringBuilder.
		
		justBuilder.append(lowerCase);
		
		System.out.println(justBuilder);
		
	}

}
