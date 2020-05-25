package practise;

import java.util.Scanner;

public class LibraryProblem {
	static int fine;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] actual = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int actualdate=  Integer.parseInt(actual[0]);
        int actualmonth=  Integer.parseInt(actual[1]);
        int actualyear=  Integer.parseInt(actual[2]);
        
        
        String[] expected = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int expecteddate=  Integer.parseInt(expected[0]);
        int expectedmonth=  Integer.parseInt(expected[1]);
        int expectedyear=  Integer.parseInt(expected[2]);
        
        
        if(actualdate==expecteddate && actualmonth==expectedmonth && actualyear==expectedyear) {
        	fine=0;
        }else if(actualdate>expecteddate && actualmonth==expectedmonth && actualyear==expectedyear) {
        	
        	fine=15*(actualdate-expecteddate);
        }else if(actualdate==expecteddate && actualmonth>expectedmonth && actualyear==expectedyear) {
        	fine=500*(actualmonth-expectedmonth);
        }else if(actualdate>expecteddate && actualmonth>expectedmonth && actualyear==expectedyear) {
        	fine=500*(actualmonth-expectedmonth);
        }
        else if(actualdate==expecteddate  && actualmonth==expectedmonth  && actualyear>expectedyear) {
        	fine=10000;
        }else if(actualdate==expecteddate && actualmonth>expectedmonth && actualyear>expectedyear) {
        	fine=10000;
        }else if(actualdate>expecteddate && actualmonth>expectedmonth && actualyear>expectedyear) {
        	fine=10000;
        }else if(actualdate>expecteddate && actualmonth==expectedmonth && actualyear>expectedyear) {
        	fine=10000;
        }
        // new cases
        else if(actualdate<expecteddate && actualmonth<expectedmonth && actualyear>expectedyear) {
        	fine=10000;
        }else if(actualdate<expecteddate && actualmonth==expectedmonth && actualyear>expectedyear) {
        	fine=10000;
        }else if(actualdate==expecteddate && actualmonth<expectedmonth && actualyear>expectedyear) {
        	fine=10000;
        }else if(actualdate==expecteddate && actualmonth==expectedmonth && actualyear>expectedyear) {
        	fine=10000;
        }
        
        
        
        
        
        
        
      System.out.println(fine);      
           
	}

}  
