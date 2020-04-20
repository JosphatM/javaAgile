
public class ReferencesAndMemory {

	public static void main(String[] args) {
		
		/**int var1  =  5;  
		int var2  =  9;  
		   var1  =  var2;  
		   var2  =  10;     
		   
		System.out.print(var1);  */
		/**
		Object a = new Object();
		Object b = new Object();
		
		a=b;
		System.out.println(a);
		System.out.println(b);*/
		
		StringBuilder word1 = new StringBuilder("First");
		StringBuilder word2 = new StringBuilder("Second");
		
		word1=word2;
		word1.reverse();
		System.out.println(word1);
		System.out.println(word2); 
	}

}
