package practise;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		String s="aabbc";
		char[] c=s.toCharArray(); 
		int size=c.length;
		int i=0;
		
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		//lhm.put('a',lhm.getOrDefault('a', 0)+1 );
		while(i!=size)  
		{
			if(lhm.containsKey(c[i])==false){  
				lhm.put(c[i], 1);
				
			}else {
				int oldval=lhm.get(c[i]);
				int newval=oldval+1;
				lhm.put(c[i], newval); 
				
			}
			
			i++;
		}		
		
	
		for(int k=0;k<lhm.size();k++) {
			
			System.out.println(lhm.get(c[k]));
			
			
		}
		
		
	//	Set<Entry<Character,Integer>> linkedmap=lhm.entrySet();  
		for(Entry<Character,Integer> data:lhm.entrySet() ){
			
 
//				if(data.getValue()<2) {
					System.out.println("first non repeating character is " +data.getValue());
//					break;
//				}
				
			

			

			
			
		
   
		}
		 
		
		
		

	}

}
