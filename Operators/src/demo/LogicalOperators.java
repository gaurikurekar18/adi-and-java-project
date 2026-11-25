package demo;

public class LogicalOperators {
	public static void main(String[]args) {
		int age=10;
		boolean license=true;
	//	System.out.println(age>=18 & license==true);//driving
		//         true               true          true  
		
	//	System.out.println(age>=18  & license == true);//driving
		//                 //false               true           false
		
	//	System.out.println(age>=18 & license == true );//driving
		//                    true             false               false
		
	//	System.out.println(age>=18 & license == true);//driving
		//                 false                  false                false
		
		
		
		
		
		
		//MOVIE plan me and mybro
		double ticketPrice=850;
		boolean isMYBroandME=false;
//	 System.out.println(ticketPrice<500 || isMYBroandME==true);
		//                  true                     false            true
		
		
		
//	   System.out.println(ticketPrice<500 || isMYBroandME==true);
		//                true                     true                true  
		
		
//	  System.out.println(ticketPrice<500 || isMYBroandME==true);
		//                  false                         true               true 
		
		
		System.out.println(ticketPrice<500  || isMYBroandME==true);
		//                false                            false                                                             false
	
	
	
	}

}
