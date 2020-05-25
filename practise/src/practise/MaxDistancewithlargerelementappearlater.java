package practise;

public class MaxDistancewithlargerelementappearlater {

	public static void main(String[] args) {
		
		int[] a= {7,9,5,6,3,2};  
		int max_dist=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length-1;j++) {
				
				
				if(a[j]>a[i] && j>i) {
					max_dist=Math.max(max_dist, a[j]-a[i]);
					
				}
				
			}
			
			
		}
		
		
		System.out.println(max_dist);
		
	}

}
