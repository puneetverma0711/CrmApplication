package codewithdeepunderstandingandplayaround;

public class Error5 {

	public static void main(String[] args) {
		try{
            //....Some file processing logic
         } catch(Exception ex1){
             ex1.printStackTrace();
         }/* catch(IOException ex2){
             ex2.printStackTrace();
         } */ 
		
		// more generic exception here should be caught before parent exception
		// here compiler exception will be thrown

	}

}
