package practise;

public class TripletSum {

	
	public static boolean checktripletsum(int[] arr,int sum) {
		for(int i=0;i<arr.length-3;i++) {
			
		for(int j=0;j<arr.length-2;j++) {
			
			
			for(int k=0;k<arr.length;k++) {
				if(arr[i]+arr[j]+arr[k]==sum && i!=j && i!=k && j!=k) {
					return true;
				}
				
				
			}
			
		}	
			
			
		}
		
		
		
		return false;
	}
	
	public static void main(String[] args) {
	   	int a[]= {12,1,4,3,6,9};
		int targetsum=24;
		boolean result=checktripletsum(a,targetsum);
		System.out.println(result); 
		
	}

}
