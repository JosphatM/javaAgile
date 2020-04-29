
public class TestClass {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Create a separate test class with a main method that creates an instance of the class and exercises its methods. 
		 *  		
		*/
		
		Course testClass = new Course("Java", 5, 1200.00,0);
		
		testClass.setMaximumParticipants(20);
		
		System.out.println("Welcome to " + testClass.getCourseGiver() + ". " + "Here are the details of the course: " );
		
		System.out.println("There are " + testClass.getMaximumParticipants() + " participants of this course.");
		
		System.out.println("The cost per head of the course will be " + "$" + testClass.getPrice()/testClass.getMaximumParticipants());
		
	}
	

}
