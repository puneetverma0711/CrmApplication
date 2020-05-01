package practise;

import java.util.Scanner;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	Difference(int[] arr){
		this.elements=arr;
	}

	public int computeDifference() {
		maximumDifference=-1;
		int cur_diff;
		
		for(int i=0;i<elements.length;i++) {
			
			for(int j=i+1;j<elements.length;j++) {
				cur_diff=elements[i]- elements[j];
				cur_diff=Math.abs(cur_diff);
				if(cur_diff>maximumDifference) {
					
					maximumDifference=cur_diff;
					
				}
	
			}
			
			
					}
		
		
		maximumDifference=Math.abs(maximumDifference);
		
		return maximumDifference;  
		
		
	}

	
	
	
} 



public class Solution10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);

	}

}
