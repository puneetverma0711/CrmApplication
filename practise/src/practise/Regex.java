package practise;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {

	public static void main(String[] args) {
		
		String pattern="[understandingg]";  
		String text="g";
		
		Pattern pt=Pattern.compile(pattern);
		Matcher mt=pt.matcher(text);
		boolean result=mt.matches();
		System.out.println(result);
		  
		
		//bitwise and or
		
		int a=25,b=31;
		System.out.println(Integer.toBinaryString(a)); //11001
		System.out.println(Integer.toBinaryString(b)); //11111
		int c=a & b; // and 11001
		int d=a | b; // or 11111
		System.out.println(c);
		System.out.println(d);
		

	}

}
