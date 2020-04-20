
public class Course {

	private String name = null;
	private int numberOfDays = 0;
	private double price =0.0;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Course(String name, int days, double price) 
	{
	  this.name = name;
	  this.numberOfDays = days;
	  this.price = price;
	} 
}
