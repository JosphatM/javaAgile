

public class BookOfChange {

	public static void main(String[] args) {
		
	
		Coin Coin1 = new Coin();
		Coin Coin2 = new Coin();
		Coin Coin3 = new Coin();
		
		double firstThrow = Coin1.getFace();
		double secondThrow = Coin2.getFace();
		double thirdThrow = Coin3.getFace();
		/**
		 * Test method
		 */
		System.out.println(Coin1.getFace());
		System.out.println(Coin2.getFace());
		System.out.println(Coin3.getFace());
		
		double[] toss = {firstThrow,secondThrow,thirdThrow	};
		/**
		 * Test array
		 */
		System.out.println(toss);
		
		int HeadCount  = 0;
		int TailCount = 0;
		
		for(int i = 0; i < toss.length; i++)
		{
			
			if(firstThrow < 0.5 && secondThrow < 0.5 && thirdThrow < 0.5) {
			    System.out.println("Old Yang line");
			}
			else if (firstThrow > 0.5 && secondThrow > 0.5 && thirdThrow > 0.5) {
			    System.out.println("Old Yin line");
			}
			else if (firstThrow < 0.5 && secondThrow < 0.5 && thirdThrow > 0.5) {
			    System.out.println("Young Yang line");
			}
			else if (firstThrow > 0.5 && secondThrow > 0.5 && thirdThrow < 0.5) {
			    System.out.println("Young Yin line");
			}
			else {
				System.out.println("Out of desired order!!");
			}
			
			/**
			if(toss[i]<0.5) {
				HeadCount ++;
				}else if(toss[i]>0.5){
					TailCount ++;
				}
			if(HeadCount == 3) {
				System.out.println("Old Yang line");
			}
			if(TailCount == 3) {
				System.out.println("Old Yin line");
			}
			if(HeadCount == 2) {
				System.out.println("Young Yang line ");
			}else if(TailCount == 2) {
				System.out.println("Young Yin line");
			}
			*/
	
		}
	}

}
