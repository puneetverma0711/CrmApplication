package practise;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Mappractise {
	
	public static void main(String[] args) {
		TreeMap<String,String> tmap=new TreeMap<String,String>();
		tmap.put("riya@gmail.com", "riya"); 
		tmap.put("julia@julia.me", "julia"); 
		tmap.put("sjulia@gmail.com", "julia");
		tmap.put("julia@gmail.com", "julia");
		tmap.put("samantha@gmail.com", "samantha");
   		tmap.put("tanya@gmail.com", "tanya");
   		
   	     
   	 for(Entry<String,String>  data:tmap.entrySet()) {
	    	 System.out.println(data.getValue()); 
	     } 
	}

}
