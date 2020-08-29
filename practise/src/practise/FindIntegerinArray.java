package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntegerinArray {

	
	public static int findelement(int[] arr) {
		int result=0;
		int diff=-1;
		boolean flag=false;
		List<Integer> list = new ArrayList<Integer>();
		//Collections.addAll(list, Arrays.stream(arr).boxed().toArray(Integer[]::new));  
		Arrays.sort(arr);
		
		outer: for (int i = 0; i < arr.length; i++) {
			     flag=false;
			if(!list.contains(Math.abs(arr[i]))) {
				list.add(Math.abs(arr[i])); 
				
			}else {
				continue outer;
				
			}
			
			inner:for (int j = 0; j < arr.length; j++) {
				
				if(i!=j) {
				diff=Math.abs(arr[i])- Math.abs(arr[j]);      
				}
				
				if(diff==0) {
					flag=true;
					break inner;	
				}
				
			}
			 
			if(flag==false) {  
				result=arr[i];
				
			}
			
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		
		int arr[]= {6,8,5,-6,-5};         
		System.out.println(findelement(arr));      
	}

}
