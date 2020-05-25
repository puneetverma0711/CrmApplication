package practise;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ascendingnameswithregualarexpressionusingmap {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       
        TreeMap<String,String> tmap=new TreeMap<String,String>();
        
        for (int NItr = 0; NItr < N; NItr++) {
        	String[] firstNameEmailID = scanner.nextLine().split(" ");
            String  firstName = firstNameEmailID[0];
            String  emailID = firstNameEmailID[1];
       
            String pattern="^[a-z\\.]+@gmail.com$";   
            Pattern pt=Pattern.compile(pattern);
            Matcher mt=pt.matcher(emailID);
            boolean result=mt.matches();
            if(result==true) {
            tmap.put(emailID,firstName);
            }
        
            
        }
  
        List<String> nameslist = new ArrayList<String>(tmap.values());
       Collections.sort(nameslist,new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			
			return o1.compareTo(o2); 
		}   
       });
        
       
       for(String names:nameslist) {
    	   System.out.println(names);   
       }
         
        
        
       
        
        
        
        scanner.close();
	
	}

}
