package practise;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		String evenstr="";
		String oddstr="";
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String name = sc.next();
			for (int j = 0; j < name.length(); j++) {
			  	if(j%2==0) {
			  		evenstr=evenstr+name.charAt(j);
			  	}
			  	
			  	if(j%2!=0) {
			  		oddstr=oddstr+name.charAt(j);
			  	}
			
			}
			System.out.println(evenstr +" " +oddstr);
			evenstr="";
			oddstr="";
        }
		sc.close();
    }

	}
