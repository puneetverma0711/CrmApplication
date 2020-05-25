package practise;

import java.util.Arrays;
import java.util.Scanner;

public class BitWiseprob {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
            int[] a=new int[n];
    		
    		for(int i=0;i<a.length;i++) {
    			a[i]=i+1;
    		}
    	
    		int max_val=Integer.MIN_VALUE;
    		
    		for(int j=0;j<a.length;j++) {
    			
    			for(int m=j+1;m<a.length;m++) {
    				int cur_val=a[j] & a[m];
    				if(cur_val>max_val && cur_val<k) {
    					max_val=cur_val;
    				}
    				
    			}
    			
    		}
    		
    		
    		System.out.println(max_val); 
    		
    		
            
        }

       
        
        
        scanner.close();		
	}

}
