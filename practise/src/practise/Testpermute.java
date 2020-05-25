package practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Testpermute {

	 
	static String twoArrays(int k, int[] A, int[] B) {
		 String result="YES";
		 int[] arrDesc = Arrays.stream(A).boxed()
				    .sorted(Collections.reverseOrder())
				    .mapToInt(Integer::intValue)
				    .toArray();
		
		 
		/*  array to list conversion
		  List li=Arrays.stream(arrDesc) .boxed() .collect(Collectors.toList());
		 */
		
		 for(int i=0;i<arrDesc.length;i++) {
			  if(arrDesc[i]+B[i]>=k) {
			    continue;	  
				  
			  }else {
				  
				  return result="NO";
			  }
			  
		  }
		 
	
		 return result;
	
	 
	 
	 
	 }
	
	public static void main(String[] args) {
	
	int a[]= {1,2,2,1};
	int b[]= {3,3,3,4};
    int k=5;
   String outpt= twoArrays(k,a,b);
	System.out.println(outpt);
	
	}

}
