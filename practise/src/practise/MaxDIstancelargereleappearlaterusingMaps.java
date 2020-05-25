package practise;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MaxDIstancelargereleappearlaterusingMaps {

	
	//we have to write method to get map max entry or min entry through comparable or stream
	
	
	public static Integer minval(LinkedHashMap<Integer,Integer> lmap) {
		
		Entry<Integer,Integer> minEntry = Collections.min(lmap.entrySet(), new Comparator<Entry<Integer,Integer>>() {
	        public int compare(Entry<Integer,Integer> e1, Entry<Integer,Integer> e2) {
	            return e1.getKey()
	                .compareTo(e2.getKey());
	        }
	    });
		 
		return minEntry.getKey();  
	}
	
	
public static Integer maxval(LinkedHashMap<Integer,Integer> lmap) {
		
	Entry<Integer,Integer> maxEntry = Collections.max(lmap.entrySet(), new Comparator<Entry<Integer,Integer>>() {
        public int compare(Entry<Integer,Integer> e1, Entry<Integer,Integer> e2) {
            return e1.getKey()
                .compareTo(e2.getKey());
        }
    });
		
		return maxEntry.getKey();  
	}
	  
	
	
	
	
	public static void main(String[] args) {
		
		int[] a= {7,9,5,6,3,2}; 
		
		LinkedHashMap<Integer,Integer> lmap=new LinkedHashMap<Integer,Integer>();
		
		int size=a.length;
		int i=0;
		while(i<size) {
			lmap.put(a[i], i);
			i++;
		}
		
		
		System.out.println(lmap.toString());  
		System.out.println(maxval(lmap));
		System.out.println(minval(lmap));  
		

	}

}
