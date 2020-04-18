package practise;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		
          String name="sushmita";
          
         char[] c=name.toCharArray();
		int size=c.length;
		int i=0;
		
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		while(i!=size) {
			
			if(map.containsKey(c[i])==false) {
				map.put(c[i], 1);
				
				
			}else {
				int oldval=map.get(c[i]);
				int newval=oldval+1;
				map.put(c[i], newval);
				
				
			}
			
			
			i++;
										
			
		}
		
		
		
		
		Set<Entry<Character,Integer>> hmap=map.entrySet();
		
		for(Entry<Character,Integer> data:hmap)
		
		{
			
			if(data.getValue()>1) 
			
			{
				
				System.out.println("first non repeating char is:" +data.getKey());	
			break;
			}
			
			
			
			
		}
		
		
		
		
		
		
	}

}
