package practise;

import java.util.HashSet;
import java.util.Set;

public class storingUniqueCharusingSet {

	public static void main(String[] args) {
		
		String abc="PUNEETVERT"; //PUNVR
		StringBuffer sb=new StringBuffer();
		char[] a=abc.toCharArray();
		
		Set<Character> s=new HashSet<Character>();
		
		for(Character val:a) {
		
			if(!s.contains(val)) {
				
				s.add(val);	
				sb.append(val);
			}
			
			
		}
		
		
		System.out.println(sb.toString());   
		
		
	}

}
