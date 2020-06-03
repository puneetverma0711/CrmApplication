package practise;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s="puneet";
		String b="etnupe";
		char[] c=s.toCharArray();
        char[] n=b.toCharArray();
  
	    Arrays.sort(c);
	    Arrays.sort(n);
	   System.out.println(c);
	   System.out.println(n);
	    if(Arrays.equals(c, n)) {
	    	System.out.println("string are anagram");
	    	
	    }else {
	    	System.out.println("string are not anagram");
	    	
	    }
	}

}
