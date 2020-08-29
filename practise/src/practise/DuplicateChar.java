package practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String s="amazonautomation";
		char[] c=s.toCharArray();
		int size=c.length;
		LinkedHashMap<Character,Integer> se=new LinkedHashMap<Character, Integer>();
		int i=0;
		while(i!=size) {
			
			if(se.containsKey(c[i])==false)
			{
				se.put(c[i], 1);
				
				
				
			}else {
				int oldval=se.get(c[i]);
				int newval=oldval+1;
				se.put(c[i], newval);
			}
			
			
			i++;
			
		}
		
		
		
		Set<Entry<Character,Integer>>  set=se.entrySet();
		
		
		for(Entry<Character,Integer> data: set) {
			
			if(data.getValue()>1) {
				System.out.println(data.getKey());
				System.out.println(data.getValue());
			}
			
			
			
			
		}
		
		
		
		/*
		 * Set<Character> se= new HashSet<>();
		 * 
		 * for(char v:c) { if(se.add(v)==false) { System.out.println(v);
		 * 
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
		
		
		
		 
		
		
		
		/*for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++) {
				
				if(c[i]==c[j] && i!=j) {
					
					System.out.println(c[j]);    
				}
				
				
			}*/
			
			
		}
		

	}


