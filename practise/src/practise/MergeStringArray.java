package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeStringArray {

	public static void main(String[] args) {
		String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        
        
        List<String> li=new ArrayList<String>();
		
        
        for(int i=0;i<names1.length;i++) {
        
        li.add(names1[i]);
        
	}

	System.out.println(li.size());

	
	for(int j=0;j<names2.length;j++) {
		
		if(!li.contains(names2[j])) {
			
			li.add(names2[j]);
			
		}
		
		
	}
	

	
	System.out.println(li.size());
	Iterator<String> it=li.iterator();
	
	while(it.hasNext()) {
		
String names=it.next();
		
System.out.println(names);  

	}
	
	
	
	
	
	
}

}