package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxMin {

	
	static int maxMin(int k, int[] arr) {
		int minunfairness=0;
		Arrays.sort(arr);
		List<Integer> sublist=new ArrayList<Integer>();
		for(int i=0;i<k;i++) {
			sublist.add(arr[i]);
			
		}  
		
		int minele=sublist.get(0);
		int maxele= sublist.get(sublist.size()-1);
		minunfairness=maxele-minele;
		
		return minunfairness;


    }
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        int result = maxMin(k, arr);

        System.out.println(result);  

        scanner.close();

	}

}
