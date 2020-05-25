package codewitherrors;

import java.util.HashMap;
import java.util.Map;

public class Error1 {

	static Map<Integer,String> map = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		
		byte b = 1;
        map.put(1, "Hello World");
        String s = map.get(b);
        System.out.println("The result is: " +s);
		// result is null

	}

}
