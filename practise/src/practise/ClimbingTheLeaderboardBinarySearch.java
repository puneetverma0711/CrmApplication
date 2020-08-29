package practise;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingTheLeaderboardBinarySearch {

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		// score array like 100,100,50,40,40,20,10
		//alice score like 5,25,50,120
		
		int n = scores.length;
		int m = alice.length;

		int res[] = new int[m];
		int[] rank = new int[n];

		rank[0] = 1;

		for (int i = 1; i < n; i++) {
			if (scores[i] == scores[i - 1]) {
				rank[i] = rank[i - 1];
			} else {
				rank[i] = rank[i - 1] + 1;
			}
		}

		// here rank array would look like this at this point 1,1,2,3,3,4,5
		
		for (int i = 0; i < m; i++) {
			int aliceScore = alice[i];
			if (aliceScore > scores[0]) {
				res[i] = 1;
				
				// this condition now first take 5 score from alice array and 
				// then compare with first value 100 and check if 5 is greater than 100
				// if yes then its alice first value rank will be marked as 1
			} else if (aliceScore < scores[n - 1]) {
				res[i] = rank[n - 1] + 1;
				// this condition  first take 5 score from alice array and 
				// then compare with last  value 10 and check if 5 is less than 10
				// if yes then its alice first value rank will be marked as last rank plus 1
			} else {
				int index = binarySearch(scores, aliceScore); // now here if  our value lies
				// in b/w 100 and 10 then we do the binary search
				res[i] = rank[index];

			}
		}
		return res;

	}

	private static int binarySearch(int[] a, int key) {

		int lo = 0;
		int hi = a.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] < key && key < a[mid - 1]) { // here we just tweak the condition
				// i.e check if eg 25 is not greater than 100 and not less than 10
				// now 25 is compared with a[mid] which is 3 , if 25 is less than mid
		// and 25 is greater than a[mid-1] which is a[2]=20 then we return mid
				return mid;
			} else if (a[mid] > key && key >= a[mid + 1]) {
				//similarly we check for other condition with little bit tweaking
				return mid + 1;
			} else if (a[mid] < key) {
				hi = mid - 1;
			} else if (a[mid] > key) {
				lo = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] scores = new int[n];

		for (int i = 0; i < n; i++) {
			scores[i] = in.nextInt();
		}

		int m = in.nextInt();
		int[] alice = new int[m];

		for (int i = 0; i < m; i++) {
			alice[i] = in.nextInt();
		}

		int result[] = climbingLeaderboard(scores, alice);
		System.out.println(Arrays.toString(result));
	}

}