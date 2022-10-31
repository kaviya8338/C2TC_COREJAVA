package abstraction_package;


 public class withdrawl  extends Bank
{
	 void w() 
	{
		int amount=10000;
		
		System.out.println(" The withdrawl limit per day :"+amount);
	}
	 void D(int depit)
	 {
	

		 System.out.println(" A deoist limit per day :"+depit);
		 
		 if(depit<60000)
			 
		 {
			 System.out.println(" your eligible"); 
			 
		 }
			
		 else
		 {  
			 System.out.println(" your not eligible");  
			 System.out.println("Emergency pay interest 5%"); 
			 
			 
		 }
		 
		 
		 
		 

	 }
	 
}
 
	