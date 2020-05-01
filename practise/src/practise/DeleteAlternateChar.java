package practise;

import java.util.Scanner;

public class DeleteAlternateChar {

	public static void main(String[] args) {
		
		System.out.println("enter the string"); 
         Scanner scr=new Scanner(System.in);
         String s=scr.nextLine();
        
        
        int noofdeletions=0;
        
        for(int i=0;i<s.length()-1;i++) {
        if(s.charAt(i)==s.charAt(i+1)) {
        	noofdeletions++;
            
        }
            
            
        }
        System.out.println(noofdeletions); 

		
		
		
		
		
		/*
		 * String s="AAAABBBB";
		 * 
		 * char[] c=s.toCharArray(); int result=0;
		 * 
		 * for(int i=0;i<c.length-1;i++) { if(c[i]==c[i+1]) { result=result+1;
		 * 
		 * }
		 * 
		 * 
		 * } System.out.println(result);
		 * 
		 */	}

}
