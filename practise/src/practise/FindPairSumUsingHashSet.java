package practise;

import java.util.HashSet;
import java.util.Set;

public class FindPairSumUsingHashSet {

	public static int getpair(int a[],int k){
		int no_of_pairs=0;
		Set<Integer> s=new  HashSet<Integer>();
		
		for(int i:a) {
			// k-i is used because let say k=12,then x+y=12 and y=12-x and here x is i
			// so in this way we can find the y and break out of the loop because
			// this will find me the pair
			if(s.contains(k-i)) {
				System.out.println("first number is: " +(k-i) +" second number is: " +i);
				no_of_pairs++;
				
			}else {
				s.add(i);
				
			}
			
		}
		
		return no_of_pairs;
	}
	
	
	public static void main(String[] args) {
		int a[]= {1, 5, 7, -1, 5};
		int k=6;
		System.out.println("no of pairs are: " +getpair(a,k));
		
		
		
	}

}
