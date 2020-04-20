
public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder eventLogger = new StringBuilder("Errors:\n");
		
	    System.out.println("Initial capacity " + eventLogger.capacity());
	    
	    eventLogger.append("Warnings:\n");
	    
	    int index = eventLogger.lastIndexOf("Warnings:");
	    
	    eventLogger.insert(index, "Fridge on fire\n");
	    
	    index = eventLogger.length();
	    
	    eventLogger.insert(index, "Fridge wrong colour\n"); 
	    
	    System.out.println(eventLogger);
	    
	    System.out.println("Final capacity " + eventLogger.capacity());
	    
	}

}
