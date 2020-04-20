import java.util.Date;
public class Exercise5_2 {

	public static void main(String[] args) {
		//  In “main,” create a new Date object. Use the necessary import statement.
		
		Date myDate = new Date();
		
		String weddingDate = myDate.toString();
		
		System.out.println(weddingDate);
		
		StringBuilder uppercaseDate = new StringBuilder(weddingDate.toUpperCase());
		
		System.out.println(uppercaseDate);
		
		System.out.println("Today's date is.... " + uppercaseDate);
		
	}

}
