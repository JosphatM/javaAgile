
public class ASCIITableViewer {

	public static void main(String[] args) {
		System.out.println("ASCII character table" + '\n');
		// the 'for' loop counts from 33 to 126, the range of the
		// reliably printable characters in the ASCII table
		for (int i = 33; i < 127; i++)
		{
		// convert the integer to a 'char' using a cast
		char character = (char)i;
		// display the ASCII number along with its character
		// then add a tab
		System.out.print(i + ": " + character + '\t');
		// if there are 9 characters on a row, add a line feed
		if ((i - 32) % 9 == 0)
		{
		System.out.println('\n');
		}
		}
	}

}
