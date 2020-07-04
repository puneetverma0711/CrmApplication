package practise;

import java.util.Arrays;
import java.util.Scanner;

public class MatchingSocks {

	private static final Scanner scanner = new Scanner(System.in);
	
	
    static int sockMerchant(int n, int[] ar) {
         int no_of_pairs=0;

         Arrays.sort(ar);
         int count=0;
         int start_index=0;
         for(int i=0;i<ar.length;i++) {
        	 i=start_index;
        	if(i<ar.length-1) {
        		 if(ar[i]==ar[i+1]) {  
            		 count++;
            		 no_of_pairs=no_of_pairs+count;
            		 count=0;
            		 start_index=i+2;
            	 }else {
            		 count=0;
            		 start_index=i+1;
            	 }
        	}
    
         }
         
             return no_of_pairs;

    }

    
	
	
	
	public static void main(String[] args) {
		

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);  
		
		

	}

}
