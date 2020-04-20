//import the definition of the 'Date' class from java.util


import java.util.Date;
import java.util.Formatter;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the default 'Date' constructor sets the object to the current
		//date and time
		Date myDate = new Date();
		//we can display a Date object because it has a 'toString'
		//method, which is implicitly called here
		Formatter myDateFormatter = new Formatter();
	    myDateFormatter.format("%tR",myDate);
	    System.out.println(myDateFormatter);
		
	}

}
