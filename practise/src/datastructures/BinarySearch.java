package datastructures;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int length=a.length;
		int key=6;
		int result=binarysearch(a,key,0,length-1);
		
		if(result==-1) 
			System.out.println("element not found"); 
		else 
			System.out.println("element found at position: " +result);  
		

	}
  
	public static int binarysearch(int[] a, int key, int low, int high) {
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(key==a[mid]) 
			return mid;
			
			if(key<a[mid])
			high=mid-1;
			
			if(key>a[mid])
			low=mid+1;
			
			
		}
		
		
		
		return -1;
	}

}
