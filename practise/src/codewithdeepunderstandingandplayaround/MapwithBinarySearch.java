package codewithdeepunderstandingandplayaround;


import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;


import codewithdeepunderstandingandplayaround.testinterface.a;

public class MapwithBinarySearch {

public static int binarysearch(LinkedHashMap<Integer, Integer> bmap, int key) {
   
	Set<Integer> data=bmap.keySet();
	int high=0;
	int low=0;

	for (Integer a:data) {
		low=a;
		break;
	}
LinkedList<Integer> list = new LinkedList<Integer>(data);
	Iterator<Integer> it=list.descendingIterator();
	while(it.hasNext()){
		high=it.next();
		break;
	}
	
	int flag=0;
	 while(high<=low) {  
	
		int mid=(low+high)/2; 
		
		if(key==bmap.get(mid)) 
			return mid;
	
		 
		 
		if(key<bmap.get(mid)) 
		{
			flag++;
			high=mid+1; 
		}
		
		
         if(key>bmap.get(mid) && flag==0 && mid==1) {
			
			return mid;
		}
		
		
		
		if(key>bmap.get(mid) && flag==0) {
			
			low=mid-1;
		}
        
		
		if(key>bmap.get(mid) && flag!=0) {
		
			return mid;
		}
		
	 }
	

		
		return -1;
	}
	 
	public static void main(String[] args) {
		int arr[]= {50,65,77,90,102};
		int[] alicerank= new int[arr.length];
		LinkedHashMap<Integer, Integer> bmap=new LinkedHashMap<Integer, Integer>();
		bmap.put(5, 60);
		bmap.put(4, 75);
		bmap.put(3, 80);
		bmap.put(2, 90);
		bmap.put(1, 100);
		
		int i=0;
		int size=arr.length;
		
		while(i<size){

			int cur_rank=binarysearch(bmap, arr[i]); 
			     if(cur_rank==-1) 
			     {
			    	 alicerank[i]=bmap.size()+1;
			    	 
			     }else {
			    	  alicerank[i]=cur_rank;
			    	 
			     }
				
		
			     
			   
			     
			     
			     
			     
			     i++;

		}
		
		
		for (int j = 0; j < alicerank.length; j++) {
			
			System.out.print(alicerank[j] + " ");  
		}
		
		
	}

}
