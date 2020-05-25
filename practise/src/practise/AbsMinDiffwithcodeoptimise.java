package practise;

import java.util.Arrays;

public class AbsMinDiffwithcodeoptimise {

	public static long min_absolute_diff(long[] a) {
		Arrays.sort(a); 
		long final_diff=1000000000;
		//System.out.println(final_diff);
		long cur_diff;
		
		for(int i=0;i<a.length-1;i++) {
			cur_diff=Math.abs(a[i]-a[i+1]);
					if(cur_diff<final_diff) {
						final_diff=cur_diff;
					}	
		
		}
		
		
		return final_diff;
		
	}
	
	
	public static void main(String[] args) {
		
		long a[]= {3,-7,0};
		long output=min_absolute_diff(a);
		System.out.println(output);

	}

}
