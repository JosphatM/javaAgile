
/**
 * 
 * Create the Course class with its attributes, methods, and constructors.
 * @author jmmur
 *
 */
public class Course2 {
	
	/**
	 *   Add a “maximumParticipants” attribute with appropriate getters and setters.  
	 */
	
	private int maximumParticipants = 0;
	
	/**
	 *   Add a new constructor that takes account of your new attribute.  
	 * @param maximumParticipants 
	 */
	public Course2(int maximumParticipants) {
			
		this.maximumParticipants = maximumParticipants;
		}

	public int getMaximumParticipants() {
		return maximumParticipants;
	}
	
	/**
	 *  
	 * @param maximumParticipants
	 *   Modify your “setMaximumParticipants” method to ensure the consistency of the object state. 

	 */
	public void setMaximumParticipants(int maximumParticipants) {
		
		if (maximumParticipants >=1 && maximumParticipants <=30) {
			
			this.maximumParticipants = maximumParticipants;
			
		}
				
		else 
		{
		System.out.println("Error: Please check the number of candidates");	
			
		}
			
			
	}

	public void setPrice(int i) {
		// TODO Auto-generated method stub
		
	}
		
		
}
