package practise;

import java.util.Scanner;

public class CountingValleys {
	
	
	 private static final Scanner scanner = new Scanner(System.in);
	
	static int countingValleys(int n, String s) {
            int no_of_valleys=0;

            char a[]=s.toCharArray();
            
            int pos=0;
            for(int i=0;i<a.length;i++) {
            	
            	if(a[i]=='D') {
            		pos+=-1;
            		
            	}
            	
            	if(a[i]=='U') {
            		pos+=1;
            	}
            	
            	
            	if(pos==0 && a[i]=='U') {
            		no_of_valleys++;
            		
            	}
            	
            }
            
            
            
            
            return no_of_valleys;
    }

   
	
	

	public static void main(String[] args) {
		 int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        String s = scanner.nextLine();

	        int result = countingValleys(n, s);
                  System.out.println(result);    

	}

}
