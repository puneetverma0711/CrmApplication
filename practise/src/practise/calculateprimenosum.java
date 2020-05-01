package practise;

public class calculateprimenosum {

	public static void main(String[] args) {
		//i%2==1
		
		
		 int i =0;
	       int num =0;
	       
	       int sum=0;
	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		    System.out.println("prime no is " +i);
		     sum =sum+i;
		  }	
	       }	
	       
 
	       System.out.println("TOTAL SUM of all the prime no within hundred numbers is " +sum);
	}

}
