package practise;

import java.util.Scanner;

public class Solution {

	public static void main(String[] dude) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        
			  for(int i=0;i<=10;i++){ System.out.print(n); System.out.print(" x");
			  System.out.print(" " +i); System.out.print(" = " +n*i); System.out.println();
			  }
			  
			  scanner.close();
			        
	        
try {
		
	int a=10,b=0;
	int c=a/b;
	
	
}catch(ArithmeticException e) {
	System.out.println("ArithmeticException  occured");
	System.exit(0);    // to skip finally  block
	 
}
catch(Exception e) {
	System.out.println("exception  occured");
	  
	 
}

finally{
	System.out.println("finally block");  
	
}
	         

	}

}
