package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;



public class LearbStoredata {

	 public static HashMap<Integer, Integer> getCurrentBoard(int[] scores,int[] ascore){
		
		 Integer[] scorearr=Arrays.stream(ascore).boxed().toArray(Integer[]::new);
    	 List<Integer> scorelist=new ArrayList<Integer>(Arrays.asList(scorearr));
	Collections.sort(scorelist,new Comparator<Integer>() {

		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	});	  
		 
	 HashMap<Integer, Integer> alice_rankbrd=new HashMap<Integer, Integer>();
	
		 HashMap<Integer, Integer> cur_board=new HashMap<Integer, Integer>();
		 int i=0,j=1;
		 int size=scores.length;
		 
		 while(i<size) {
			 if(!cur_board.containsValue(scores[i])) {
				 cur_board.put(j, scores[i]); 
				 j++;
			 }
			 i++;
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 return alice_rankbrd;
	 }
	
	
	public static void main(String[] args) {
		
		int scores[]= {100,100,50,40,40,20,10};
		int alicescore[]= {5,25,50,120};
		HashMap<Integer, Integer> hmap=getCurrentBoard(scores,alicescore);
		
		for(java.util.Map.Entry<Integer, Integer> data:hmap.entrySet()) {
		System.out.println(data.getKey() + "||" +data.getValue());	  
		}
		
		
		

	}

}
