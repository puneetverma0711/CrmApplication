package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//program to find out pairs in an array having difference equal to given target value 

public class PairsWithModifiedLoopingfortimecomplexity {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,8,6,4,2};
		int no_of_pairs=0;
		int target_val=2;
		// here i have sorted the array at the beginning so that while using two nested for loop i 
		// can ignore pairs which have been considered in previous iteration
		
		
		Arrays.sort(a);
 
		for(int i=0;i<a.length-1;i++) {
			
			// in this inner loop i have  put another condition  along with less than array size, where
			// i check  one more condition where j and i difference is less than the target value, this 
			// will allow my program to skip further extra conditions iterations in the inner loop
			// which increases the time complexity of my program 
			for(int j=i+1;j<a.length && a[j]-a[i]<=target_val;j++) {	
					if(a[j]-a[i]==target_val) {
 						//System.out.print(a[i] +" " +a[j]);
							no_of_pairs++;

						}
				
	
			}
			
			
		}


	System.out.println("no of pairs in array having  difference equal to target value is " +no_of_pairs);
	
	}

}
