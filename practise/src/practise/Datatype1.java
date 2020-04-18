package practise;

		import java.io.*;
		import java.util.*;
		import java.text.*;
		import java.math.*;
		import java.util.regex.*;

		public class Datatype1 {
			
		    public static void main(String[] args) {
		        int i = 4;
		        double d = 4.0;
		        
		        String s = "HackerRank ";
				
		        Scanner scan = new Scanner(System.in);

		          int secondint;
	                double seconddouble;
	                String secondstring;

	                /* Read and save an integer, double, and String to your variables.*/
	                secondint=scan.nextInt();
	             seconddouble=scan.nextDouble();
	              secondstring = scan.next();  // reads the next token 
	                 secondstring += scan.nextLine();
	                // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

	                /* Print the sum of both integer variables on a new line. */
	                System.out.println(i+secondint);
	                
	                
	                /* Print the sum of the double variables on a new line. */
	                 System.out.println((double)Math.round((d+seconddouble) * 10d) / 10d);
	                /* Concatenate and print the String variables on a new line; 
	                    the 's' variable above should be printed first. */
	                System.out.println(s+secondstring);
	        scan.close();
	    }

	}

