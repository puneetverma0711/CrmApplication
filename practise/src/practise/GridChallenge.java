package practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GridChallenge {

	static String gridChallenge(String[] grid) {
		String result="";
		
		// converting single array into 2d array and string single string elements into 2d array by converting into 
		//tochararray

		char[][] newgrid=new char[grid.length][grid.length];   
		
		for(int i=0;i<newgrid.length;i++) {
			char[] a=grid[i].toCharArray();
			for(int j=0;j<newgrid[0].length;j++) {
				newgrid[i][j]=a[j];
			}

		}
		sortRowWise(newgrid);	
sortbycol(newgrid);  
  
outer:for(int j=0;j<newgrid.length;j++) {
	for(int i=0;i<newgrid.length-1;i++) {
		
		if(newgrid[i][j]>newgrid[i+1][j]) {
			result="NO";
			break outer;		
		}else {
			result="YES";
		}	
	}  
}				


		
		return result;
    }

	
	public static void sortRowWise(char[][] m) {
		
		for (int i = 0; i < m.length; i++) { 
			  
            // loop for column of matrix 
            for (int j = 0; j < m[i].length; j++) { 
  
                // loop for comparison and swapping 
                for (int k = 0; k < m[i].length - j - 1; k++) { 
                    if (m[i][k] > m[i][k + 1]) { 
  
                        // swapping of elements 
                        char t = m[i][k]; 
                        m[i][k] = m[i][k + 1]; 
                        m[i][k + 1] = t; 
                    } 
                } 
            } 
        } 
		
	}


	public static void sortbycol(char[][] newgrid) {
		Arrays.sort(newgrid, new Comparator<char[]>() { 
            
	          @Override              
	          // Compare values according to columns 
	          public int compare( char[] entry1, char[] entry2) { 
	           //sorting 3 rd index column value
	        	  char col1=entry1[0];
	           char col2=entry2[0];  
	        	  
	            // To sort in descending order revert  
	            // the '>' Operator 
	            if (col1 > col2) 
	            	return 1;
	            else
	            return -1;
	          } 
	        });  // End of function call sort(). 
	    } 
		
		
	


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String[] grid = new String[n];

            for (int i = 0; i < n; i++) {
                String gridItem = scanner.nextLine();
                grid[i] = gridItem;
            }

            String result = gridChallenge(grid);
System.out.println(result);
           
        }


        scanner.close();


	}

}
