package practise;

import java.util.ArrayList;
import java.util.List;



public class Triplet {

	public static int no_of_triplet=0;
	public static void main(String[] args) {
		
		int a[]= {1,3,9,9,27,81};
		int k=3;
		int counter;
		int n=0;
		List<Integer> laststoredindexlist=new ArrayList<Integer>();
		while(n<a.length) {
			counter=0;
			laststoredindexlist.clear();
			
			
			loop:for(int i=n;i<a.length;i++) {
				
				if(laststoredindexlist.contains(i)) {
					i++;
				continue loop;
				}
				
				if(a[i]*k==a[i+1]) {
					counter++;
					
				}else {
					n++;
					break loop;
					
				}
				
				//counter if start  here
			if(counter==3) {
				no_of_triplet++;
				n=0;
				counter=0;
				laststoredindexlist.add(i);
				continue loop;
			}
			//counter if end here
			
			
			}
			//for loop end here
			n++;
			
			
		}
		//while loop end here
		
	}

}
