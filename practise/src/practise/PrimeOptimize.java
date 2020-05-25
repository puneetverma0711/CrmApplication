package practise;

import java.util.Scanner;

public class PrimeOptimize {
		
	
	public static boolean isprime(int n) {
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			
			if(n%i==0) {
				return false;	
			}
			}
		if(n==1) {
				return false;
			}else if(n==2) {
				return true;
			}else {
			return true;
			}
			
			
		
		
	}
	
	public static void main(String[] args) {
Scanner scr=new Scanner(System.in);
		
		int T=scr.nextInt();
		int a[]=new int[T];    
		for(int i=0;i<T;i++) {
			a[i]=scr.nextInt();
			
		}

		for(int j=0;j<a.length;j++) {
			if(isprime(a[j])==true) {
				System.out.println("Prime");
				
			}else {
				
				System.out.println("Not Prime");
			}
			
		}
		
		scr.close();
	
	
	}
		
	}
