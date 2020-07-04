package practise;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map.Entry;

public class StoreArrayinreducedformHashing {

	public static void main(String[] args) {
		//10,40,50,28,78
		int a[]= {10,20,15,12,11,50};
		int temp[]= a.clone();  //to create a close of original array and
		//copy the contents on different array we use clone method
				
		Arrays.sort(temp);  //temp is 10,20,40
		
		
		Hashtable<Integer,Integer> table=new Hashtable<Integer,Integer>();
		
		for(int j=0;j<temp.length;j++) {
			table.put(temp[j], j);
			 
			
		}

		
		for(int k=0;k<a.length;k++) {
			a[k]=table.get(a[k]);
			System.out.println(a[k]);        
			
		}
		
		
	}

}
