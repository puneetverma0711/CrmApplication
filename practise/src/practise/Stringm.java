package practise;

public class Stringm {

	public static void main(String[] args) {
	
		
		String s = "hello puneet test";
		
		System.out.println(s.charAt(7)); 
		System.out.println(s.indexOf("e")); 
		
		System.out.println(s.indexOf("e", 8));   
		System.out.println(s.indexOf("e", s.indexOf("e", 10)));        
		System.out.println(s.indexOf("e", s.indexOf("e", s.indexOf("e", 11))));          
		

	}

}
