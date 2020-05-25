package practise;

public class AtoiProgram {

	public static int atoi(String a) {
		int result=0;
		for(int i=0;i<a.length();i++) {
			int ascii=a.charAt(i) - '0';
			
			if(ascii>=0 && ascii<=9) {
				int convertedval=Character.getNumericValue(a.charAt(i));
				result=result*10+convertedval;
				
			}else {
				
				return -1;
			}
			
			
			
		}
		
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		String a="32a";
		int output=atoi(a);
		System.out.println(output);
		
		

	}

}
