package practise;

import java.util.ArrayList;
import java.util.List;

public class Test90 {

	public static String findNumber(int arr[], int k) {
	   String output= "No";
	   for(int i=0;i<arr.length;i++) {
		   if(arr[0]==k) {
			   return output="Yes";
			   
		   }
		   
		   
	   }
	   
        return output;
    }
	
	
	 public static List<Integer> oddNumbers(int l, int r) {
		 List<Integer> arr1=new ArrayList<Integer>();
			
		 for(int i=l;i<=r;i++) {
			 if(i%2!=0) {
				 arr1.add(i); 
			 }
			 
		 }
		 
		 return arr1;

	    }
	
	
	
	public static void main(String[] args) {
		int[] arr= {7,8,9};
		int k=7;
		String resultString=findNumber(arr,k);  
		System.out.println(resultString);  
	    System.out.println(oddNumbers(1,20));
		double d= 10.0/-0;
		if(d==Double.POSITIVE_INFINITY) 
			System.out.println("positive");
		
		else 
			System.out.println("negative");
		
		
		
		
		
	}
		
}
