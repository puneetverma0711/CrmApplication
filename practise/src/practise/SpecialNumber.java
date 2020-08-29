package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpecialNumber {

	
	public static String specialnum(List<Integer> numberList, int num) { 
		String result=null;

		int[] numarr=coverttoarray(num);
		
		for(int i=0;i<numarr.length;i++) {
			
			if(numberList.contains(numarr[i])) {
				result="Special!!";     
				continue;
				
			}else {
				result="Not Special!!";
				break;
			}
			
			
		}
		
		
		
		
		return result;
	}
	
	
	public static int[] coverttoarray(int num) { 
		String temp = Integer.toString(num); 
		int[] arr = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
			System.out.println(temp.charAt(i)); // ascii of 5 is 53 ,4 is 52 
			arr[i] = temp.charAt(i) - '0';   // ascii of 0 is 48  ,sof first 53-48=5 , then 52-48=4 and so on
		  // basically we here convert char 5 into integer and store in an array 
		}
		
		return arr;
	}


	public static void main(String[] args) {
	int num=541;
		List<Integer> numberList= new ArrayList<Integer>();
		numberList.add(0);
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		
		System.out.println(specialnum(numberList,num));
		
		

	}

	

}
