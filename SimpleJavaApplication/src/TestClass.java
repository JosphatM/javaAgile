
public class TestClass {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Create a separate test class with a main method that creates an instance of the class and exercises its methods. 
		 *  		
		*/
		Course2 testClass = new Course2(0);
		
		testClass.setMaximumParticipants(35);
		
		System.out.println(testClass.getMaximumParticipants());
	}

}
 