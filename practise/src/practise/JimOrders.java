package practise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JimOrders {

	
	static int[] jimOrders(int[][] orders) {
		
		int temporders[][]=new int[orders.length][3];
       int a[]=new int[orders.length];
		
		for(int i=0;i<temporders.length;i++) {
			
			temporders[i][0]=i+1;
			temporders[i][1]=orders[i][0];
			temporders[i][2]=orders[i][0]+orders[i][1];
			
		}
		
		
		//this outer loop is for considering the columns in single row
      for(int j=0;j<temporders.length;j++) {
    	  int flag=0;
    	//this inner loop is for considering the all the rows (with specific last column)
    	  for(int i=0;i<temporders.length-1-j;i++) {
    		  
    		  if(temporders[i][2]>temporders[i+1][2]) {
        		  int t=temporders[i][2];
        		  temporders[i][2]=temporders[i+1][2];
        		  temporders[i+1][2]=t;
    		
        		  int temporderswap=temporders[i][1];
        		  temporders[i][1]=temporders[i+1][1];
        		  temporders[i+1][1]=temporderswap;
        		  
        		  int tempcustomernoswap=temporders[i][0];
        		  temporders[i][0]=temporders[i+1][0];
        		  temporders[i+1][0]=tempcustomernoswap;
        		  flag=1;
    		
    	  }
    	  
    	  }
    	  
    	  if(flag==0) {
			  break;
			  
		  }  
    	  
    	  
      }
		
		
		
		/*
		 * for(int i=0;i<temporders.length;i++) {
		 * 
		 * for(int j=0;j<temporders[i].length;j++) {
		 * 
		 * System.out.print(temporders[i][j] + " ");
		 * 
		 * } System.out.println(); }
		 */
		 
		
      for(int i=0;i<temporders.length;i++) {
    	  a[i]=temporders[i][0];
    	  
      }
		
		 System.out.println(Arrays.toString(a)); 
		
		return a;
		
    }
	
	
	

		
	



	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
  
		 
		int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[][] orders = new int[n][2];

	        for (int i = 0; i < n; i++) {
	            String[] ordersRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 2; j++) {
	                int ordersItem = Integer.parseInt(ordersRowItems[j]);
	                orders[i][j] = ordersItem;
	            }
	        }

	        jimOrders(orders);

	       

	        scanner.close();
	        
	}
	
	}
