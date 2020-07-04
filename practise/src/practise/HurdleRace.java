package practise;

import java.util.Scanner;

public class HurdleRace {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	
	 static int hurdleRace(int k, int[] height) {
      int min_dose=0;
      
      int maxval=getMaxValue(height);
      
      if(maxval>k) {
    	  return min_dose=maxval-k;
    	  
      }else {
    	  
    	  return min_dose; 
      }
      

	    }

	 
	 
	 
	 public static int getMaxValue(int[] a) {
			int max_ele=Integer.MIN_VALUE;
			for(int i=0;i<a.length;i++) {
				
				if(a[i]>max_ele) {
					max_ele=a[i];			
				}
		
			}   
			return max_ele;
		}

		

	public static void main(String[] args) {
		String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);
      System.out.println(result);     
	}

}
