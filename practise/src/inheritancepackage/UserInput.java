package inheritancepackage;

public class UserInput {

	
	
	public static class TextInput {
				
		public static String val="true";
		
		
		
		public static void addchar(char p) {
			val=val+p;
			System.out.println(val);
		}
		
		
		public static String getvalue(String val) {
			return val;
			
		}
		
	}
	
	
	public static class NumericInput extends TextInput  {
       
		public static void addchar(char p) {
			if(val.matches("true")) {   
				val="";     
	
			}
			
			
			System.out.println(val);
		}
		
		
		/*
		 * public static void addchar(char c) { c='9'; String
		 * value=Character.toString(c);
		 * 
		 * String b=value.replaceAll("[a-zA-Z]", "");
		 * 
		 * System.out.println(b);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		
	}
	
	
	public static void main(String[] args) {
	
	TextInput.addchar('d');
	
		NumericInput.addchar('s');

		    
		    
	}

}
