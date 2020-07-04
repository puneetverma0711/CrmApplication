package practise;

import java.util.Scanner;

public class ElectronicsShop {
	
	  private static final Scanner scanner = new Scanner(System.in);

	
	 static int getMoneySpent(int[] keyboards, int[] drives, int b) {
	       int money_spend=-1;
	       
	       int current_moneyspend=0;
	       
	       for(int i=0;i<keyboards.length;i++) {
	    	   
	    	   for(int j=0;j<drives.length;j++) {
	    		   
	    		   current_moneyspend=keyboards[i]+drives[j];
	    		   
	    		   if(current_moneyspend>money_spend && current_moneyspend<=b)
	    		   money_spend=current_moneyspend;
	    		   
	    	   }
	    	   
	    	   
	       }
	       
	       return money_spend;

	    }

	  
	public static void main(String[] args) {
		String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        

        int moneySpent = getMoneySpent(keyboards, drives, b);
  
        System.out.println(moneySpent);   
        
	}

}
