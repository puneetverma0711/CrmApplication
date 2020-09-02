package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LeaderBoard {

	
	
	 private static final Scanner scanner = new Scanner(System.in);
	
	 public static int[] climbingLeaderboard(int[] scores,int[] ascore){

		 int alicerank[]=new int[ascore.length]; 
		
		 
		 
	 HashMap<Integer, Integer> lead_brd=getLeaderBoard(scores);
		 
		 int i=0;
		int size=ascore.length;
		
		while (i<size) {
			int flag=0;
			inner:for(java.util.Map.Entry<Integer, Integer> data:lead_brd.entrySet()) {
				
				 
				if(ascore[i]>data.getValue() && data.getKey()==1) { 
					alicerank[i]=data.getKey();
					flag=1;
					break inner;	
				}
				
				if(ascore[i]>data.getValue()) { 
					alicerank[i]=data.getKey();
					flag=1;
					break inner;	
				}
				 
				
				if(ascore[i]==data.getValue()) {
					alicerank[i]=data.getKey(); 
					flag=1;
					break inner;	
				}
				
				
				if(ascore[i]<data.getValue()) {
					continue inner;	
				}
				
				
			}
			
		if(flag==0) {         
			alicerank[i]=lead_brd.size()+1;
			
		}
		
		i++;

		}
		
	 return alicerank;
	 }

	   
	 public static  HashMap<Integer, Integer> getLeaderBoard(int[] scores) {
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
		
		return cur_board;
		
		}
	
	 
	 
	/* public static List<Integer> getSortedArray(int[] ascore) {
		 Integer[] scorearr=Arrays.stream(ascore).boxed().toArray(Integer[]::new);
    	 List<Integer> scorelist=new ArrayList<Integer>(Arrays.asList(scorearr));
	Collections.sort(scorelist,new Comparator<Integer>() {

		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
	});	  
		 
		return scorelist;                   
		 
		 
		 
		 
		 
		 return cur_board;
	 }
	 
	*/
	 
	 
	 
	public static void main(String[] args) {
		 int scoresCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] scores = new int[scoresCount];

	        String[] scoresItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < scoresCount; i++) {
	            int scoresItem = Integer.parseInt(scoresItems[i]);
	            scores[i] = scoresItem;
	        }

	        int aliceCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] alice = new int[aliceCount];

	        String[] aliceItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < aliceCount; i++) {
	            int aliceItem = Integer.parseInt(aliceItems[i]);
	            alice[i] = aliceItem;
	        }

	        int[] result = climbingLeaderboard(scores, alice);

	        for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
	         
	        
	}

}
