package practise;

import java.util.Arrays;

public class Sortingusinghashing {

	
	static void sortUsingHash(int a[], int n) 
	{ 
	    // find the maximum element 
	    int max = Arrays.stream(a).max().getAsInt(); 
	  
	    // create a hash function upto the max size 
	    int hash[] = new int[max + 1]; 
	  
	    // traverse through all the elements and  
	    // keep a count 
	    for (int i = 0; i < n; i++) 
	    hash[a[i]] += 1; 
	  
	    // Traverse upto all elements and check if  
	    // it is present or not. If it is present,  
	    // then print the element the number of times 
	    // it's present. Once we have printed n times,  
	    // that means we have printed n elements 
	    // so break out of the loop 
	    for (int i = 0; i <= max; i++) 
	    { 
	  
	        // if present 
	        if (hash[i] != 0) 
	        { 
	  
	            // print the element that number of  
	            // times it's present 
	            for (int j = 0; j < hash[i]; j++) 
	            { 
	                System.out.print(i+" "); 
	            } 
	        } 
	    } 
	} 
	  
	
	
	
	public static void main(String[] args) {
		int a[] = { 9, 4, 3, 2, 5, 2, 1, 0, 4,  
	            3, 5, 10, 15, 12, 18, 20, 19 }; 
	    int n = a.length; 
	  
	    sortUsingHash(a, n);

	}

}
