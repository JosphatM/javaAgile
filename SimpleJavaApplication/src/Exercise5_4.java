import java.util.Date;

public class Exercise5_4 {

	
	public static void main(String[] args) {
		
		Date dateNow = new Date();
		
		long passed = dateNow.getTime();
		
		System.out.println("The milliseconds passed since January 1, 1970 are " + passed);
		
		long days = passed/86400000;
		
		System.out.println(days);
		
		long years = days / 365;
		
		System.out.println(years);
		
		long hours = (passed-days)/3600000;
		
		long daysSince = hours / 24;
		
		System.out.println(daysSince);
		
		long minutes = (passed - (days + hours))/60000;
		
		System.out.println("The time since January 1, 1970 is " + days + " days " + hours + " hours and " + minutes + " minutes CUNT!");
		
		
	}

}
