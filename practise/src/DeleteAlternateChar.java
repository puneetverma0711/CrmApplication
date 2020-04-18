import java.util.ArrayList;
import java.util.List;

public class DeleteAlternateChar {

	public static void main(String[] args) {
		//ABABAB
		
		String name="AABBAABBAABB";
		      char c[]=name.toCharArray();
		int min_deletion=0;
		List<Character> li=new ArrayList<Character>();
		for(int i=0;i<c.length-1;i++) {
			
			
			
				
				if(c[i]==c[i+1])
				{
				
					min_deletion++;
					
					
				}
				
				if(!li.contains(c[i]) && c[i]==c[i+1])
				{
					
					li.add(c[i]);
					
					
				}
			
			
			
			
		}
		      
		
		
		System.out.println(min_deletion);
		
		for(int k=0;k<li.size();k++) {
			
			System.out.println(li.get(k));
			
			
		}

	}

}
