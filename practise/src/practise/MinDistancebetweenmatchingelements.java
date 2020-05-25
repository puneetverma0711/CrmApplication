package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MinDistancebetweenmatchingelements {

	
	/* static int minimumDistances(int[] a) {
         int min_dist=Integer.MAX_VALUE;

         List<Integer> li=new ArrayList<Integer>();
         int min_so_far=0;
         int flag=0;
         for(int i=0;i<a.length;i++) {
              
        	 if(!li.contains(a[i])) {
        		 li.add(a[i]);
        		
        		 
        	 }else if(li.contains(a[i])) {
        		 min_so_far=i-li.indexOf(a[i]);
        		 if(min_so_far<min_dist) {
        			 min_dist=min_so_far;
        		 }
        		 flag=1;
        		 
        	 }
        	 

         }
         

         if(flag==0 && min_so_far==0) {
    		 min_dist=-1;
    		 
    	 }
         
         
         return min_dist;
	    }

	 */  

	 static int minimumDistances(int[] a) {
         int min_dist=Integer.MAX_VALUE;
    
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();   
         
         
        for(int i=0;i<a.length;i++) {
        	int current_index=i;
        	if(hmap.containsKey(a[i])) {
        		int previousindex=hmap.get(a[i]);
                 min_dist=Math.min(min_dist, current_index-previousindex);
                 hmap.put(a[i], current_index);
        		
        	}else {
        		
        		hmap.put(a[i], i);
        	}
  
        }
        
  
        if(min_dist==Integer.MAX_VALUE) {
        	min_dist=-1;
        	
        }
        
        
         
         return min_dist;
	   
	 
	 
	 }


	 
	 
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

       System.out.println(result);  
        scanner.close();
		
		

	}

}
