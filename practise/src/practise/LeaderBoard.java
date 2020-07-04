package practise;

import java.util.HashMap;
import java.util.Scanner;

public class LeaderBoard {

	
	
	 private static final Scanner scanner = new Scanner(System.in);
	
	 static int[] climbingLeaderboard(int[] scores, int[] alice) {
         int rankings[]=new int[alice.length]; 
         HashMap<Integer, Integer> leaderboard=getCurrentBoard(scores);
		 HashMap<Integer, Integer> alice_scoreranks=new HashMap<Integer, Integer>();
          
          
		 
		 
		 

         return rankings;
         
	    }

	   

	 public static HashMap<Integer, Integer> getCurrentBoard(int[] scores){
		 HashMap<Integer, Integer> cur_board=new HashMap<Integer, Integer>();
		 
		 
		 
		 
		 
		 return cur_board;
	 }
	 
	
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

	        
	        System.out.println(result); 
	        
	}

}
