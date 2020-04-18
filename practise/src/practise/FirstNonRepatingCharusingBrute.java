package practise;

public class FirstNonRepatingCharusingBrute {

	public static void main(String[] args) {
		
		
		String name="sushmita";
		int k=0;
		
		for(int i=0;i<name.length();i++) {
			
			for(int j=i+1;j<name.length();j++)
			
			{
				
				if(name.charAt(i)==name.charAt(j) && i!=j) {
					 
		System.out.println("first  repeating char:" +name.charAt(j));		 				
		k++;			
		break;
					
				}
				
				if(k==1) {
					
					break;
					
				}
				
				
			}
			
			
		}
		
		
		
		
	}

}
