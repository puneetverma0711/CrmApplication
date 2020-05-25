package practise;

import java.util.Arrays;
import java.util.Scanner;

public class MarksandToys {
	
	static int maximumToys(int[] prices, int k) {
        int max_amount_spend=0,purchasedtoys=0;
         Arrays.sort(prices);
         for(int i=0;i<prices.length;i++)          
        
         {
        	 
        	 max_amount_spend=max_amount_spend+prices[i];
        	 
        	 if(max_amount_spend<=k) {
        		 purchasedtoys++;
        		 continue;
        		 
        	 }else {
        		 break;
        		 
        	 }
        		 
        		 
        	 
        	 
         }
        	 
		
		
        return purchasedtoys;
    }

	
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

       System.out.println(result);

        scanner.close();

		
		

	}

}
