package practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class Beautifulday {

	private static final Scanner scanner = new Scanner(System.in);
	
	  
    static int beautifulDays(int i, int j, int k) {
          int range=Math.abs(i-j);
    	List<Integer> li=new ArrayList<Integer>();
    	int n=0;
    	int start=i;
    	while(n<=range) {
    		int reversenum= reversenum(start);
			int diff=Math.abs(start-reversenum);
			int beautifulnum=diff%k;
			
			if (beautifulnum==0) {
				 li.add(beautifulnum);
			}
    		
			start++;
			n++;
    		
    	}
    	

    	
    	
          return li.size();
    
    }

    
    
    public static int reversenum(int num) {
    	int reversed=0;
    	while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
    	
    	return reversed;
    }
    
	
public static void main(String[] args) {
	String[] ijk = scanner.nextLine().split(" ");

    int i = Integer.parseInt(ijk[0]);

    int j = Integer.parseInt(ijk[1]);

    int k = Integer.parseInt(ijk[2]);

    int result = beautifulDays(i, j, k);
	System.out.println(result);
	
	
}
	
	
	
}
