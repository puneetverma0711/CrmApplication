package practise;

import java.util.Arrays;
import java.util.Scanner;

public class ToysContainer {
	public static final Scanner scanner = new Scanner(System.in);
	
	static int toys(int[] a) {
		Arrays.sort(a);  
  int container=1;
  int min_allowed_weight=0;
  int start_container=a[0];
  
  outer:for(int i=0;i<a.length;i++) {
	  
	  min_allowed_weight=4+start_container;
	  
	  if(a[i]<=min_allowed_weight) {
		  continue outer;
		  
	  }else {
		  start_container=a[i];
		  container++;
	  }
	  
	  
	  
	  
  }
  
  
  
		
		return container;

    }
	
	
	

	public static void main(String[] args) {
		
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] w = new int[n];

        String[] wItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int wItem = Integer.parseInt(wItems[i]);
            w[i] = wItem;
        }

        int result = toys(w);
System.out.println(result);  

        scanner.close();

	}

}
