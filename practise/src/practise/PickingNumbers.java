package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;





public class PickingNumbers {

	
	 public static int pickingNumbers(List<Integer> a) {
		   int max_elements=0;
		   
		   Collections.sort(a);
  int cur_diff=0;
  int start=0;
  int count=0;
 
		   List<Integer> finallistIntegers=new ArrayList<Integer>();
		outer:for (int i = 0; i < a.size(); i++) {
			   i=start;
			   count++;
			   if(count>1) {
				   break outer;
				   
			   }
			   
			  
			inner:for (int j = i+1; j < a.size(); j++) {
				
				cur_diff=Math.abs(a.get(i)-a.get(j)); 
				 
			    if (cur_diff>1) {
			    	finallistIntegers.clear();
					 start=j;
					 count=0;
					
			     break inner;
			    	
				}
				
				finallistIntegers.add(a.get(i));
				int cur_elements=finallistIntegers.size();
			    
			    if (cur_elements>max_elements) {
					max_elements=cur_elements;
				}
			    
			  
				
			}
		    

		}
		   
		  
		   
		   
		   return max_elements+1; 

		    }

		

	
	
	
	public static void main(String[] args) {
	    int arr[]= {1,2,2,1,2,2};
	    Integer[] arrintInteger=Arrays.stream(arr).boxed().toArray(Integer[]::new);
	    List<Integer> a=Arrays.asList(arrintInteger);

	        int result = PickingNumbers.pickingNumbers(a);
		System.out.println(result); 
		
		

	}

}
