package practise;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LenaLuck{


	 static int luckBalance(int k, int[][] contests) {
	
		 int luck_balance=0;
		 
		 Arrays.sort(contests, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {
				return -1*Integer.compare(a[0],b[0]);
			}
		 });  
		
		 
		 
		 for(int i=0;i<contests.length;i++) {
			 int cur_balance=contests[i][0];
			 int rating=contests[i][1];
			 
			 if(rating==1 && k>0) {
				 k--;
				 luck_balance=luck_balance+cur_balance;
				 
			 }else if(rating==1 && k==0) {
				 luck_balance=luck_balance-cur_balance;
				 
			 }
			 
			 
			 if(rating==0) {
				 luck_balance=luck_balance+cur_balance;  
				 
			 }
			 
			 
			 
		 }
		 
		 
		 
		 
return luck_balance;
		 
		 
		 
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

      System.out.println(result);  

        scanner.close();
		
		
		
	}


}



/*  unoptimised code of lenluck
 * package practise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LenaLuck {

	
	
	 static int luckBalance(int k, int[][] contests) {
	
		 int min_luck=Integer.MAX_VALUE;
		 int allowed_to_lose;
		 int total_impcontest=0;
		 int sum=0;
		 int rows=contests.length;
		 int cols=contests[0].length;
		 int cur_luck=0;
		 int m=0;
		 for(int p=0;p<contests.length;p++) {
			 cur_luck=contests[p][m];
			   
			 if(cur_luck<min_luck) {
				 min_luck=cur_luck;
			 }

			 if(contests[p][m+1]==1) {
			 total_impcontest=total_impcontest+contests[p][m+1];
			 }
			 
		 }
		 
   
	allowed_to_lose=total_impcontest-k;
   
   for(int i=0;i<rows;i++) {
	   
	   for(int j=0;j<cols-1;j++) {
		   
		int luck=contests[i][j];
		int rating=contests[i][j+1];
		
		
		if(luck <=min_luck && rating==1 && allowed_to_lose>0)
		{
			sum=sum-luck;
			allowed_to_lose--;
		}
		
		if(luck >min_luck) {
			sum=sum+luck;
		}
		

	   }
	   
   }
   

  
		 
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

      System.out.println(result);  

        scanner.close();
		
		
		
	}


	

}

 */

