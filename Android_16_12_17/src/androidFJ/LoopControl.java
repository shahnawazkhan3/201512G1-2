package androidFJ;

public class LoopControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		for  (int x =0; x<8 ; x++) {
//			System.out.println("foor loop " +x);
//		}
//		

		
		
		///////////////////////////////while Loop in java////////////////
		

//		
//		int x= 0;
//		while (x<10) {
//			System.out.print("value of x : " + x );
//			
//			x++;
//			 System.out.print("\n");
//		}
		
		
		
		 
		///////////////////////// do while loops ////////
		

	       
//		int x = 0;
//		do {
//			System.out.println("values :"+ x);
//			x++;
//			System.out.println("\n");
//		}while(x< 3); 
	      
		////////////////Break statement in java///////////////////////
		

		
//		int [] numbers = {12,23,30,33,22};
//		for (int x : numbers ) {
//			if(x==30) {break ;}
//			 System.out.print( x );
//	         System.out.print("\n");
//		}
		
		
		////////////////////Continue statement in java//////////////////
		
		
		  int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         if( x == 30 ) {
	            continue;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }
		
		
	      
	}

}
