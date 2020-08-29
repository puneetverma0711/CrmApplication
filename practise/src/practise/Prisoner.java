package practise;

import java.util.Scanner;



public class Prisoner {

	
	 private static final Scanner scanner = new Scanner(System.in);
	
	
    static int saveThePrisoner(int n, int m, int s) {
         int chair_num=0;

        	int start=1;
        	int diff=s-start;
        	int remain=m%n;
        	chair_num=(remain+diff)%n;
        	if(chair_num==0) {
        		return n;
        	}else {
        		 return chair_num;
        		}
        		
        	
   
        
    }

   
	
	
	
	public static void main(String[] args) {
		int n=7,m=19,s=2;

            int result = saveThePrisoner(n, m, s);
System.out.println(result); 

	}

}

