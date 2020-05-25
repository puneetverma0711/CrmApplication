package codewitherrors;

public class Error6 {

	public static void main(String[] args) {
		
		try{
           int i=0,j=10;
			int result=j/i;
			System.out.println(result); 
			new  ArithmeticException();
         } catch(ArrayIndexOutOfBoundsException ex1){
             ex1.printStackTrace();
         } catch(ArithmeticException ex2){
            System.out.println("divide by 0 error appear");  
         } finally{
        	 System.out.println("finally block will be executed here");  
  
         }
		// 2 nd catch clause and finally block will be executed 
		// first catch block will not be executed
		
		
	}
	
}
