package practise;

public class StringRegex {

	public static void main(String[] args) {
		
		
		String value="88puneet99";

		
		if(value.matches("[0-9a-z0-9]+")==true) {
			
			
			value=value.replaceAll("[a-z]", "");
			System.out.println("pattern matched\n"+value);
			
			
		}else {
			
			System.out.println("pattern not matched");
			
		}
		

	}

}
