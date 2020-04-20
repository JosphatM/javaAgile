import java.awt.Point;

//    Create a class with a main method.
public class Exercise5_3 {

	public static void main(String[] args) {
		/** The Point class within the java.awt package represents a simple x,y coordinate in • 
		a two-dimensional space. In “main,” create a new java.awt.Point object using the
		zero arguments constructor. Add the necessary import statement.
		*/
		int X = 3;
		
		int Y = 4;
		
		Point theSpot = new Point(X,Y);
		
		//  Display the Point object using System.out.println – where is it?  
		
		System.out.println("The spot is located at " +  theSpot);
		
		//  Change its position and display it again (see the Javadoc for details of which methods can be used to do this).
		
		
	}

}
