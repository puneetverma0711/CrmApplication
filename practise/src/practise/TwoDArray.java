package practise;

import java.util.ArrayList;
import java.util.List;

public class TwoDArray {

	public static void main(String[] args) {
		
		int numbers[][]= {
				{1,1,1,0,0,0},
				{0,1,0,0,0,0},
				{1,1,1,0,0,0},
				{0,0,2,4,4,0},
				{0,0,0,2,0,0},
				{0,0,1,2,4,0}
		};
		
		int max_sum=-63;
	
		
		
		int rows=numbers.length;
		int cols=numbers[0].length;
		
		
		
		for(int i=0; i<rows-2;i++) {
			
			for(int j=0; j<cols-2;j++) {
				
				
		 int current_sum=numbers[i][j]+numbers[i][j+1]+numbers[i][j+2]+numbers[i+1][j+1]+numbers[i+2][j]+numbers[i+2][j+1]+numbers[i+2][j+2];
		
		  
		 max_sum=Math.max(max_sum, current_sum);
				
		
				
			}
			
		}
		
		
		
    		
		System.out.println(max_sum);
		
		
	}

}
