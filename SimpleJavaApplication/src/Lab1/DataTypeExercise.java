package Lab1;

public class DataTypeExercise {

	public static void main(String[] args) {
		long myBigNumber = 2147483648L;
		float myFloat = 4.56F;
		boolean isFull = false;//literals must all be in small case letters
		int myChar = -1;
		{
		byte myByte = 127;
		}
		String filePath = "com.javabook.chapter3"; //the / is used for division
		System.out.print("Value of myBigNumber = ");
		System.out.println("myBigNumber");
		System.out.print("Value of myFloat = "); // missing ""
		System.out.println("myFloat");// missing ""
		System.out.print("Value of isFull = ");
		System.out.println("isFull"); // missing ""
		System.out.print("Value of myChar = ");
		System.out.println("myChar"); // missing ""
		System.out.print("Value of myByte = ");
		System.out.println("myByte");
		System.out.print("Value of filePath = ");
		System.out.println("filePath"); // missing ""
		
		int a = 5;
		int b = 8;
		float f = 8.0f;
		boolean c = true;
		boolean d = false;
		System.out.println("b value is " + b);
		System.out.println("b/2 value is " + b/2);
		b++;   // the value of b is added by 1
		System.out.println("b value is " + b);
		System.out.println("b/2 value is " + b/2);
		System.out.println("f value is " + f);
		System.out.println("f/2 value is " + f/2);
		f++; //value of f is added by 1
		System.out.println("f value is " + f);
		System.out.println("f/2 value is " + f/2);

	}

}
