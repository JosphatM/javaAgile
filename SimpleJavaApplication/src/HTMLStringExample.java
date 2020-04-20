
public class HTMLStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String HTMLString = new String("<!DOCTYPE html><html><head><title>My HTML Page</title></head><body><h1>Welcome to my page</h1><p>This page is written in simple HTML<p>\r\n" + 
				"<p>Since HTML files are just text markup, they can be contained in Java String objects</p></body></html>");
			
				System.out.println("String length: " + 	HTMLString.length());
				
				// length of the whole HTML page
				
				System.out.println("Has level 1 headings: " + HTMLString.contains("h1"));
				
				// check for level 1 headings
				
				System.out.println("Has level 2 headings: " + HTMLString.contains("h2"));
				
				// check for level 2 headings 
				
				System.out.println("Has a DOCTYPE: " + HTMLString.startsWith("<!DOCTYPE"));
				
				// check that the page has a DOCTYPE of some kind
				
				System.out.println("Position of the \'!\' " + HTMLString.indexOf('!'));
				
				// result is 1, because the first index is zero
				
				int startIndex = HTMLString.indexOf("body");
				
				// result is first char of "body"
				
				startIndex += 5; 
				
				// go past the rest of the characters in the tag
				
				int endIndex = HTMLString.lastIndexOf("body");
				
				// result is first char of "body"
				
				endIndex -= 2;
				
				// go back to remove the first character and the leadingString bodyContent = 
				
				String bodyContent = HTMLString.substring(startIndex, endIndex);
				
				System.out.println("Body content " + bodyContent);
	}

}
