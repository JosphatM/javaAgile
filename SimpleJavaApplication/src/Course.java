
public class Course {

/**
 * The Course class represents a training course definition,
 * not an individual delivery of the course
 * @author jmmur
 * 
 */ 
	
  private String name;
  private int numberOfDays;
  private double price; 
  private int maximumParticipants = 0;
  public static final String COURSE_GIVER = "Java Bootcamp Academy";
  
  //adding a static field
  
  public int getMaximumParticipants() {
	return maximumParticipants;
  }

  public void setMaximumParticipants(int maximumParticipants) {
	  this.maximumParticipants = maximumParticipants;
  }

	private static int numberOfCoursesCreated = 0;
	private final static double costPerHead = 0.0;
  
/**
 * zero arguments constructor
 */
   
/**
 * Parameterized constructor
 * @param name The name of the course
 * @param days The length of the course in days
 * @param price The cost of the course per person
 */ 
  
  public Course (String name, int days, double price, int participants)
  {
    setName(name);
    setNumberOfDays(days);
    setPrice(price); 
    numberOfCoursesCreated++;
    
    
  } 

  public static String getCourseGiver() {
	return COURSE_GIVER;
}

public String getName() {
     return name; 
   } 
  
  public static int getNumberOfCoursesCreated() {
	return numberOfCoursesCreated;
  }

  public static void setNumberOfCoursesCreated(int numberOfCoursesCreated) {
	Course.numberOfCoursesCreated = numberOfCoursesCreated;
  }

  public void setName(String name) {
     this.name = name;
   } 
 
  public int getNumberOfDays() {
     return numberOfDays;
   } 
 
  public void setNumberOfDays(int numberOfDays) {
    if(numberOfDays >= 1 && numberOfDays <=10)
     {
       this.numberOfDays = numberOfDays;
     }
     else
     {
       // do not accept the parameter value
       // should probably throw an exception
     }
   } 
   
  public double getPrice() {
     return price;
    } 
  
  public void setPrice(double price) {
     this.price = price; 
    }   
  
	  
  public double getDiscountedCost() {
	  
	  double percentDiscount = ((double)100-15)/100;
	  double discount = percentDiscount*this.getPrice();
	  //System.out.println(percentDiscount);
	  
   	return discount;
	}

  public static double getCostperhead(double costPerhead) {
	return costPerHead;
  }
	   
}
