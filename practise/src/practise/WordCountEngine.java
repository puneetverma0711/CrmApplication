package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WordCountEngine {

	public static void main(String[] args) {
		
		String document="Practice makes perfect. you'll only get Perfect by practice. just practice";		

		char[] doc=document.toCharArray();
		
		int size=doc.length;
		int i=0;
		HashMap<Character,Integer> lmap=new HashMap<Character,Integer>();
		
		while(i<size) {
			
			if(lmap.containsKey(doc[i])==false)
			{
				
				lmap.put(doc[i], 1);

			}else {
				
				int oldval=lmap.get(doc[i]);
				int newval=oldval+1;
				lmap.put(doc[i], newval);
				
			}
			
			i++;
		}
		
		
		List<Entry<Character,Integer>> sortedEntries = new ArrayList<Entry<Character,Integer>>(lmap.entrySet());
		Collections.sort(sortedEntries, 
	            new Comparator<Entry<Character,Integer>>() {
	                @Override
	                public int compare(Entry<Character,Integer> e1, Entry<Character,Integer> e2) {
	                    return e2.getValue().compareTo(e1.getValue());
	                }
	            }
	    );
		
		  
		
		for(Entry<Character,Integer> data:sortedEntries) {
			
			System.out.println(data.getKey()+" "+data.getValue());
			
		}
		
		
	}

}
