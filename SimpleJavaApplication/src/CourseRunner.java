
public class CourseRunner {

	public static void main(String[] args) {
		
		//create a new course
		
	    Course java = new Course("Java", 5, 1200.00, 0);
	    	    
	    System.out.println(java.getName() + " Course runs for " + java.getNumberOfDays() + " days and costs $" + java.getPrice());
	    
	    System.out.println("The discounted price is : " + java.getDiscountedCost());
	    
	    System.out.println("There are " + Course.getNumberOfCoursesCreated());
	}
}
