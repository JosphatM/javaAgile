
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
/**
 * zero arguments constructor
 */
  public Course()
  {   
    this("Unnamed Course", 3, 1000.0);
  } 
/**
 * Parameterized constructor
 * @param name The name of the course
 * @param days The length of the course in days
 * @param price The cost of the course per person
 */ 
  
  public Course (String name, int days, double price)
  {
    setName(name);
    setNumberOfDays(days);
    setPrice(price); 
 } 
  
 /**
  * @return The name of the course
  */
  public String getName() {
     return name; 
   } 
 /**
  * @param name The name of the course
  */
  public void setName(String name) {
     this.name = name;
   } 
 /**
  * @return The length of the course
  */
  public int getNumberOfDays() {
     return numberOfDays;
   } 
 /**
  * @param numberOfDays The number of days the course lasts
  */
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
   
  /**
    * @return The total price of the course
    */
    public double getPrice() {
      return price;
    } 
  /** 
    * @param price The price of the course
    *(regardless of the number of participants)
    */
    public void setPrice(double price) {
      this.price = price; 
    }   
	  
    public double getDiscountedCost(int percentDiscount) {
    	
		return percentDiscount;
	}
	  
}
