package practise;

import java.util.Scanner;

public class BinaryNumbers {

	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


	        int rem=0,s=0,t=0;


	        while(n>0)
	            {
	            rem=n%2;
	            n=n/2;
	            if(rem==1)
	             {   s++;
	               if(s>=t)

	                t=s;

	            }
	            else{

	                s=0;
	            }   
	        }

	        System.out.println(t);
	               
	        
	        
	        
	        
	        
	        
	        
	        
	        
		/*
		 * String binnumber=Integer.toBinaryString(n);
		 * 
		 * System.out.println(binnumber);
		 * 
		 * int[] numarr = new int[binnumber.length()]; for (int i = 0; i <
		 * binnumber.length(); i++) { numarr[i] = binnumber.charAt(i) - '0'; }
		 * 
		 * 
		 * int consecutive_no=1;
		 * 
		 * 
		 * for(int j=0;j<numarr.length-1;j++) {
		 * 
		 * if(numarr[j]==1 && numarr[j+1]==1) {
		 * 
		 * consecutive_no++;
		 * 
		 * }else {
		 * 
		 * consecutive_no=1; }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * System.out.println(consecutive_no);
		 */
	        
	        
	        scanner.close();
	    }

}
