package practise;

public class PatternExamples {

	public static void pattern1() {
	
	/*	*
		**
		***
		****
		***** */
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++)
			{
				  
				System.out.print("*"); 
				
			}
			System.out.println(); 
		}
	}

	
	
	public static void pattern2() {
		
		/*	*****
            ****
            ***
            **    
            *       */
			
		for(int i=0;i<5;i++) {
			for(int j=4;j>=i;j--)
			{
				  
				System.out.print("*"); 
				
			}
			System.out.println(); 
		}
	
	
	}
	
	
public static void pattern3(){
		
/*	 *****
	  ****
	   ***
	    **
	     *    */
	
		
for(int i=0;i<5;i++) {
			
			for(int j=0;j<=i;j++)  
			{
				  
				System.out.print(" "); 
				
			}
			
			
			for(int j=4;j>=i;j--)  
			{
				  
				System.out.print("*"); 
				
			}
			System.out.println(); 
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
	pattern1();	
	System.out.println("------------");
	pattern2();
	System.out.println("------------");
    pattern3();
		
		
		
		
		
		
	}	
		
}
