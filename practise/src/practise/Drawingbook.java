package practise;

import java.util.Scanner;

public class Drawingbook {
	
	 private static final Scanner scanner = new Scanner(System.in);
	 static int pageCount(int n, int p) {
	        int min_turn=0;
	        int turn=0;
	        
	        for(int i=1;i<=n;i++) {
	        	
	        	if(i%2!=0 && i!=p) {
	        		turn++;
	        		
	        	}
	        	
	        	if(i==p) {
	        		min_turn=turn;
	        		turn=0;
	        		break;
	        	}
	        	
	        }
	        
	        
              for(int j=n;j>0;j--) {
	        	
	        	if(j%2==0 && j!=p) {
	        		turn++;
	        		
	        	}
	        	
	        	if(j==p) {
	        		if(min_turn>turn) {
	        		min_turn=turn;
	        		}
	        		break;
	        	}
	        	
	        }
	        
	        
	        
	        
         return min_turn;

	    }

	   
	public static void main(String[] args) {
		
		
		
		 int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

       System.out.println(result);  
        
	}

}
